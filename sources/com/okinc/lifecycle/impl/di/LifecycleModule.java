package com.okinc.lifecycle.impl.di;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.gson.Gson;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean;
import com.okinc.lifecycle.impl.di.LifecycleModule;
import com.okinc.lifecycle.impl.net.LifecycleApiRetrofitService;
import com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC32996moC;
import o.C32872mll;
import o.C38066pKz;
import o.C38069pLb;
import o.C38169pOu;
import o.C43251rlk;
import o.C56391yDq;
import o.InterfaceC33253msv;
import o.InterfaceC38065pKy;
import o.InterfaceC38081pLn;
import o.InterfaceC38110pMp;
import o.InterfaceC38113pMs;
import o.InterfaceC46557tYt;
import o.kOG;
import o.pKI;
import o.pKL;
import o.pMA;
import o.pMG;
import o.pMH;
import o.pMK;
import o.pMM;
import o.pMT;
import o.pMX;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LifecycleModule {
    @yCR
    public final InterfaceC38065pKy KWHzl() {
        return new C38066pKz(new Function2() { // from class: o.pNg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LifecycleModule.AEQbTJ((java.lang.String) obj, (EventParamsList) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C32872mll.OLrzqt.copydefault(str, eventParamsList);
        return Unit.INSTANCE;
    }

    @yCR
    public final Gson copydefault() {
        return new Gson();
    }

    @yCR
    public final InterfaceC46557tYt EZpvd() {
        return (InterfaceC46557tYt) C43251rlk.copydefault(InterfaceC46557tYt.class);
    }

    @yCR
    public final LifecycleApiRetrofitService AEQbTJ() {
        return LifecycleApiRetrofitService.Companion.AEQbTJ();
    }

    @yCR
    public final pKL EZpvd(@NotNull LifecycleApiRetrofitService lifecycleApiRetrofitService, @NotNull C38069pLb c38069pLb) {
        Intrinsics.checkNotNullParameter(lifecycleApiRetrofitService, "");
        Intrinsics.checkNotNullParameter(c38069pLb, "");
        return new C38169pOu(lifecycleApiRetrofitService, c38069pLb, new Function1() { // from class: o.pNd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LifecycleModule.OLrzqt((TokenRecommendInfoBean) obj);
            }
        });
    }

    public static final AbstractC32996moC OLrzqt(TokenRecommendInfoBean tokenRecommendInfoBean) {
        Intrinsics.checkNotNullParameter(tokenRecommendInfoBean, "");
        return TokenRecommendImplFragment.Companion.KWHzl(tokenRecommendInfoBean);
    }

    @yCR
    public final kOG OLrzqt() {
        return (kOG) C43251rlk.copydefault(kOG.class);
    }

    @yCR
    public final pKI djBIcL() {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((pKI) C43251rlk.copydefault(pKI.class));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (pKI) objM7377constructorimpl;
    }

    @yCR
    public final pMX copydefault(@NotNull InterfaceC38113pMs interfaceC38113pMs, @NotNull pMA pma, @NotNull InterfaceC38110pMp interfaceC38110pMp, @NotNull pMM pmm, @NotNull InterfaceC33253msv interfaceC33253msv, @NotNull pMK pmk, @NotNull kOG kog, pKI pki) {
        Intrinsics.checkNotNullParameter(interfaceC38113pMs, "");
        Intrinsics.checkNotNullParameter(pma, "");
        Intrinsics.checkNotNullParameter(interfaceC38110pMp, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        Intrinsics.checkNotNullParameter(interfaceC33253msv, "");
        Intrinsics.checkNotNullParameter(pmk, "");
        Intrinsics.checkNotNullParameter(kog, "");
        return new pMT(interfaceC38113pMs, pma, interfaceC38110pMp, pmm, interfaceC33253msv, pmk, kog, pki, new Function2() { // from class: o.pNb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(LifecycleModule.EZpvd((android.content.Context) obj, (java.lang.String) obj2));
            }
        });
    }

    public static final boolean EZpvd(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @yCR
    public final pMH KWHzl(@NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull pMX pmx) {
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(pmx, "");
        return new pMG(interfaceC38081pLn, pmx);
    }
}
