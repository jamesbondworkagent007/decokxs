package com.okinc.business.dex.trade.common.expire.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.hDF;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class BaseExpireTimeListDialogFragment$initView$1$3 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, hDF> {
    public static final BaseExpireTimeListDialogFragment$initView$1$3 INSTANCE = new BaseExpireTimeListDialogFragment$initView$1$3();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseExpireTimeListDialogFragment$initView$1$3() {
        super(3, hDF.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexLimitExpireTimeItemBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ hDF invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final hDF invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return hDF.AEQbTJ(layoutInflater, viewGroup, z);
    }
}
