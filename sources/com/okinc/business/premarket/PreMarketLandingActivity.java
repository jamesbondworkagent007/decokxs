package com.okinc.business.premarket;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.premarket.PreMarketLandingActivity;
import com.okinc.market.common.bean.PreMarketLandingBean;
import com.okinc.web.WebActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC28090kOn;
import o.C28081kOe;
import o.C28099kOw;
import o.C33064mpR;
import o.C33070mpX;
import o.C33129mqd;
import o.C54589xNz;
import o.C55629xnZ;
import o.C55700xor;
import o.C56390yDp;
import o.InterfaceC54581xNr;
import o.kNX;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PreMarketLandingActivity extends ActivityC28090kOn {
    public static final ActionBar Companion = new ActionBar(null);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.premarket.PreMarketLandingActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void EZpvd(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new Intent(context, (Class<?>) PreMarketLandingActivity.class));
        }
    }

    @Override // o.ActivityC28090kOn, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt();
    }

    public static final /* synthetic */ Object copydefault(PreMarketLandingActivity preMarketLandingActivity, boolean z, InterfaceC54581xNr interfaceC54581xNr, Exception exc, Continuation continuation) {
        preMarketLandingActivity.KWHzl(z, interfaceC54581xNr, exc);
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C55700xor.marketEnsureOKTradeResume$default(C55629xnZ.AEQbTJ(this), LifecycleOwnerKt.getLifecycleScope(this), null, new PreMarketLandingActivity$initFutureBiz$1(this), 2, null);
    }

    private final void KWHzl(boolean z, InterfaceC54581xNr interfaceC54581xNr, Exception exc) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PreMarketLandingActivity$handleTradeInitResult$1(z, interfaceC54581xNr, this, null), 3, null);
    }

    @Override // o.ActivityC28090kOn
    public void copydefault() {
        super.copydefault();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if ((interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("FUTURES") : null) == null) {
            OLrzqt();
        }
    }

    @Override // o.ActivityC28090kOn
    public void KWHzl() {
        super.KWHzl();
        AYXKKw().register(PreMarketLandingIntroduce.class, new C28081kOe(new Function0() { // from class: o.kNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PreMarketLandingActivity.copydefault(this.OLrzqt);
            }
        }, new Function0() { // from class: o.kNR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PreMarketLandingActivity.valueOf(this.KWHzl);
            }
        }));
        AYXKKw().register(PreMarketLandingMore.class, new C28099kOw(new Function0() { // from class: o.kNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PreMarketLandingActivity.gEmmrt(this.AEQbTJ);
            }
        }));
        AYXKKw().register(PreMarketLandingFaq.class, new kNX(new Function0() { // from class: o.kNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PreMarketLandingActivity.AYXKKw(this.copydefault);
            }
        }));
    }

    public static final Unit copydefault(PreMarketLandingActivity preMarketLandingActivity) {
        preMarketLandingActivity.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.RSmiaq));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(PreMarketLandingActivity preMarketLandingActivity) {
        preMarketLandingActivity.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.ORmwhf));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(PreMarketLandingActivity preMarketLandingActivity) {
        ActivityC28090kOn.Companion.EZpvd(preMarketLandingActivity);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(PreMarketLandingActivity preMarketLandingActivity) {
        preMarketLandingActivity.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.ORmwhf));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("title", "")), null, 4, null);
    }

    @Override // o.ActivityC28090kOn
    public void copydefault(ArrayList<PreMarketLandingBean> arrayList) {
        ArrayList arrayList2;
        List<PreMarketLandingBean> listSubList;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new PreMarketLandingIntroduce());
        if (!C33129mqd.AEQbTJ(arrayList != null ? Integer.valueOf(arrayList.size()) : null, 4)) {
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (C33129mqd.OLrzqt((CharSequence) ((PreMarketLandingBean) obj).getState())) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                arrayList3.addAll(arrayList2);
            }
        } else if (arrayList != null && (listSubList = arrayList.subList(0, 4)) != null) {
            arrayList3.addAll(listSubList);
        }
        if (C33129mqd.AEQbTJ(arrayList != null ? Integer.valueOf(arrayList.size()) : null, 4)) {
            arrayList3.add(new PreMarketLandingMore());
        }
        arrayList3.add(new PreMarketLandingFaq());
        C33064mpR.OLrzqt(AYXKKw(), (List<? extends Object>) arrayList3);
    }

    @Override // o.ActivityC28090kOn
    public void AEQbTJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PreMarketLandingIntroduce());
        arrayList.add(new PreMarketLandingEmpty());
        arrayList.add(new PreMarketLandingFaq());
        C33064mpR.OLrzqt(AYXKKw(), (List<? extends Object>) arrayList);
    }

    @Override // o.ActivityC28090kOn, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.ActivityC28090kOn, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.ActivityC28090kOn, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.ActivityC28090kOn, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
