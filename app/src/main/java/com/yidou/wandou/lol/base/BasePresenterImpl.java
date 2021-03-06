package com.yidou.wandou.lol.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Administrator on 2016/12/7.
 */

public class BasePresenterImpl implements BasePresenter
{
    private CompositeSubscription mCompositeSubscription;

    protected void addSubcrible(Subscription s)
    {
        if (mCompositeSubscription == null)
        {
            mCompositeSubscription = new CompositeSubscription();
        }
        this.mCompositeSubscription.add(s);
    }

    @Override
    public void unSubcrible()
    {
        if (mCompositeSubscription != null)
        {
            this.mCompositeSubscription.unsubscribe();
        }
    }
}
