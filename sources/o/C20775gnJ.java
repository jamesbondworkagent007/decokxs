package o;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoWalletInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C20775gnJ;
import o.C52761wXj;
import o.C9694baS;
import o.InterfaceC54829xWw;
import o.fXY;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.gnJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C20775gnJ extends AbstractC20799gnh<C20852goh> {
    public static final Application Companion = new Application(null);
    public static final int values = 8;
    public InterfaceC58217yxC AkhnZx;
    public final Fragment DbNXlk = new Fragment();
    public boolean fetchVPNInfo;

    /* JADX INFO: renamed from: o.gnJ$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX INFO: renamed from: o.gnJ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gnJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C20775gnJ AEQbTJ(android.os.Bundle bundle) {
            C20775gnJ c20775gnJ = new C20775gnJ();
            c20775gnJ.setArguments(bundle);
            return c20775gnJ;
        }
    }

    @Override // o.AbstractC20799gnh
    public void gEmmrt() {
        if (KWHzl()) {
            EZpvd(C13754dXa.FragmentManager.FQMcgEfQMcgE);
        }
    }

    @Override // o.AbstractC20799gnh
    public void djBIcL() {
        C20690gle c20690gle = C20690gle.OLrzqt;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        AEQbTJ((AbstractC20809gnr) c20690gle.EZpvd((ComponentActivity) activity, C20852goh.class, true));
    }

    @Override // o.AbstractC20799gnh, o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        values();
    }

    public void values() {
        C10854bwM c10854bwMFHqPtx;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = AhwBna().fJNWhG();
        if (abstractC8664bGwFJNWhG == null || (c10854bwMFHqPtx = abstractC8664bGwFJNWhG.fHqPtx()) == null) {
            return;
        }
        if (c10854bwMFHqPtx.iRxXKY()) {
            AhwBna().AubY().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.gnW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20775gnJ.AEQbTJ(this.EZpvd, (java.lang.String) obj);
                }
            }));
            AhwBna().zLjUOn();
        } else if (C10854bwM.isXRCToken$default(c10854bwMFHqPtx, null, 1, null)) {
            this.DbNXlk.OLrzqt(c10854bwMFHqPtx);
            AhwBna().sSMYrx().observe(getViewLifecycleOwner(), this.DbNXlk);
            AhwBna().zuBGHE();
        } else {
            ConstraintLayout constraintLayout = valueOf().AhwBna;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
        }
    }

    public static final Unit AEQbTJ(C20775gnJ c20775gnJ, java.lang.String str) {
        if (str != null && C33129mqd.AEQbTJ(str, "0")) {
            AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = c20775gnJ.AhwBna().fJNWhG();
            java.lang.String strEZpvd = null;
            C10854bwM c10854bwMFHqPtx = abstractC8664bGwFJNWhG != null ? abstractC8664bGwFJNWhG.fHqPtx() : null;
            ConstraintLayout constraintLayout = c20775gnJ.valueOf().AhwBna;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            c20775gnJ.valueOf().djBIcL.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.to));
            c20775gnJ.valueOf().fARcdN.setVisibility(0);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.FontRes);
            android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw);
            spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, strAYXKKw.length(), 0);
            c20775gnJ.valueOf().fARcdN.setText(spannableString);
            android.widget.TextView textView = c20775gnJ.valueOf().AkhnZx;
            if (str != null) {
                strEZpvd = C54870xYj.EZpvd(str, c10854bwMFHqPtx != null ? c10854bwMFHqPtx.valueOf() : 0, c10854bwMFHqPtx != null ? c10854bwMFHqPtx.DTwDnp() : 0, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            }
            textView.setText(strEZpvd);
            android.widget.TextView textView2 = c20775gnJ.valueOf().fARcdN;
            textView2.setOnClickListener(new Activity(textView2, 1000L, c20775gnJ));
        } else {
            ConstraintLayout constraintLayout2 = c20775gnJ.valueOf().AhwBna;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        C10854bwM c10854bwMDHguZz;
        java.lang.String strHtlTjW;
        FragmentActivity activity = getActivity();
        if (activity == null || (abstractC8664bGwFJNWhG = AhwBna().fJNWhG()) == null || (c10854bwMDHguZz = abstractC8664bGwFJNWhG.dHguZz()) == null) {
            return;
        }
        long jFetchVPNInfo = c10854bwMDHguZz.fetchVPNInfo();
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2 = AhwBna().fJNWhG();
        if (abstractC8664bGwFJNWhG2 == null || (strHtlTjW = abstractC8664bGwFJNWhG2.htlTjW()) == null) {
            strHtlTjW = "";
        }
        C9694baS.Companion.KWHzl(this, ActivityC10355bmr.Companion.AEQbTJ(activity, new UtxoWalletInfo(strHtlTjW, C33129mqd.valueOf(AhwBna().djBIcL()), jFetchVPNInfo, null, 8, null)), new Function2() { // from class: o.goe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20775gnJ.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit copydefault(C20775gnJ c20775gnJ, int i, android.content.Intent intent) {
        c20775gnJ.fARcdN();
        c20775gnJ.AhwBna().zLjUOn();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gnJ$Fragment */
    public static final class Fragment implements Observer<XRC20BalanceDetailInfoResp> {
        public C10854bwM OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C10854bwM c10854bwM) {
            this.OLrzqt = c10854bwM;
        }

        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onChanged(XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp) {
            java.lang.String strEZpvd;
            Intrinsics.checkNotNullParameter(xRC20BalanceDetailInfoResp, "");
            java.lang.String receivedPendingBalance = xRC20BalanceDetailInfoResp.getReceivedPendingBalance();
            if (receivedPendingBalance != null && C33129mqd.AEQbTJ(receivedPendingBalance, "0")) {
                ConstraintLayout constraintLayout = C20775gnJ.this.valueOf().AhwBna;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                C20775gnJ.this.valueOf().djBIcL.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getExtras));
                C20775gnJ.this.valueOf().fARcdN.setVisibility(8);
                android.widget.TextView textView = C20775gnJ.this.valueOf().AkhnZx;
                java.lang.String receivedPendingBalance2 = xRC20BalanceDetailInfoResp.getReceivedPendingBalance();
                if (receivedPendingBalance2 != null) {
                    C10854bwM c10854bwM = this.OLrzqt;
                    int iValueOf = c10854bwM != null ? c10854bwM.valueOf() : 0;
                    C10854bwM c10854bwM2 = this.OLrzqt;
                    strEZpvd = C54870xYj.EZpvd(receivedPendingBalance2, iValueOf, c10854bwM2 != null ? c10854bwM2.DTwDnp() : 0, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                } else {
                    strEZpvd = null;
                }
                textView.setText(strEZpvd);
                return;
            }
            ConstraintLayout constraintLayout2 = C20775gnJ.this.valueOf().AhwBna;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.gnJ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C20775gnJ AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C20775gnJ c20775gnJ) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c20775gnJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.ejfBZ();
            }
        }
    }

    /* JADX INFO: renamed from: o.gnJ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C20775gnJ KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C20775gnJ c20775gnJ) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c20775gnJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.fJNWhG();
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bVg.getMaxTransferAmount$default(o.bVg, boolean, int, java.lang.Object):java.lang.String */
    public final void KWHzl(final AbstractC8704bHj<?, ?> abstractC8704bHj) {
        final C10854bwM c10854bwMFHqPtx;
        final android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (abstractC8704bHj == null || (c10854bwMFHqPtx = abstractC8704bHj.fHqPtx()) == null) {
            return;
        }
        valueOf().valueOf.setVisibility(0);
        C10854bwM c10854bwMKWHzl = c10854bwMFHqPtx.KWHzl();
        java.lang.String strEZpvd = null;
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.iRxXKY()) {
            java.lang.String strORxRYg = ((AbstractC11993ceZ) abstractC8704bHj).ORxRYg();
            if (strORxRYg != null) {
                strEZpvd = C54870xYj.EZpvd(strORxRYg, c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(c10854bwMFHqPtx.getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            }
        } else if (c10854bwMFHqPtx.UlJrfe()) {
            strEZpvd = C54870xYj.EZpvd(C9443bVg.getMaxTransferAmount$default((C9443bVg) abstractC8704bHj, false, 1, null), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(c10854bwMFHqPtx.getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        } else if (abstractC8704bHj instanceof C9615bYt) {
            strEZpvd = C54870xYj.EZpvd(((C9615bYt) abstractC8704bHj).OcIXYQ(), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(c10854bwMFHqPtx.getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        } else {
            java.lang.String strKWHzl = abstractC8704bHj.DarRvM().KWHzl(java.lang.Long.valueOf(abstractC8704bHj.fHqPtx().AhwBna()), abstractC8704bHj.htlTjW());
            if (strKWHzl != null) {
                strEZpvd = C54870xYj.EZpvd(strKWHzl, c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(c10854bwMFHqPtx.getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            }
        }
        int i = C13754dXa.FragmentManager.sendMediaButton;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("num", strEZpvd);
        pairArr[1] = C56390yDp.OLrzqt("token", c10854bwMFHqPtx.fJNWhG());
        java.lang.String strKWHzl2 = pTD.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr));
        android.widget.TextView textView = valueOf().gEmmrt;
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(strKWHzl2);
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        if (c10854bwMFHqPtx.iRxXKY() || c10854bwMFHqPtx.fjfviF() || c10854bwMFHqPtx.igXuih() || c10854bwMFHqPtx.UlJrfe()) {
            valueOf().gEmmrt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            C33061mpO.setupSpanStyles$default(spannableStringValueOf, new java.lang.String[]{c10854bwMFHqPtx.fJNWhG()}, 0, null, false, new Function1() { // from class: o.gnP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20775gnJ.OLrzqt(context, c10854bwMFHqPtx, abstractC8704bHj, (java.util.List) obj);
                }
            }, 14, null);
        }
        textView.setText(spannableStringValueOf);
        android.widget.TextView textView2 = valueOf().EZpvd;
        textView2.setOnClickListener(new TaskDescription(textView2, 1000L, this));
    }

    public static final Unit OLrzqt(android.content.Context context, C10854bwM c10854bwM, AbstractC8704bHj abstractC8704bHj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new C57494yjV(context.getColor(C52761wXj.Activity.QwvEab), c10854bwM.fJNWhG()));
        list.add(new StateListAnimator(c10854bwM, context, abstractC8704bHj));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gnJ$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ C10854bwM KWHzl;
        public final /* synthetic */ AbstractC8704bHj<?, ?> OLrzqt;
        public final /* synthetic */ android.content.Context copydefault;

        public StateListAnimator(C10854bwM c10854bwM, android.content.Context context, AbstractC8704bHj<?, ?> abstractC8704bHj) {
            this.KWHzl = c10854bwM;
            this.copydefault = context;
            this.OLrzqt = abstractC8704bHj;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            int i;
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            C10854bwM c10854bwM = this.KWHzl;
            android.content.Context context2 = this.copydefault;
            AbstractC8704bHj<?, ?> abstractC8704bHj = this.OLrzqt;
            if (c10854bwM.iRxXKY()) {
                viewOnClickListenerC54939xaY.EZpvd(pTD.KWHzl(context2, C13754dXa.FragmentManager.get, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", abstractC8704bHj.fHqPtx().fJNWhG()))));
            } else if (c10854bwM.fjfviF()) {
                viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.TarCU);
            } else if (c10854bwM.igXuih()) {
                viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.DWgRXt);
            } else if (c10854bwM.UlJrfe()) {
                viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.shouldWrapException);
            }
            if (c10854bwM.iRxXKY()) {
                i = C13754dXa.FragmentManager.fERRXa;
            } else {
                i = (c10854bwM.fjfviF() || c10854bwM.UlJrfe()) ? C13754dXa.FragmentManager.DarRvM : C13754dXa.FragmentManager.fERRXa;
            }
            viewOnClickListenerC54939xaY.EZpvd(i, new View.OnClickListener() { // from class: o.gof
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C20775gnJ.StateListAnimator.EZpvd(viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }

        public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
        }
    }

    public final void fJNWhG() {
        AhwBna().gHZMYf();
        AhwBna().valueOf(AhwBna().gEmmrt(AhwBna().AuCTel()));
        AbstractC20799gnh.updateAmountAndCurrencyUI$default(this, null, false, 3, null);
        AYXKKw(false);
        EZpvd();
        C14494dmX.KWHzl.EZpvd("SendSetAmount_Btm_Button_Click", "max");
    }

    @Override // o.AbstractC20799gnh
    public void AkhnZx() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        AbstractC12782ctV abstractC12782ctVDUDNAs;
        if (valueOf().copydefault.fJNWhG()) {
            return;
        }
        C32866mlf.onEvent$default("Web3SendCoin_AmountInput_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        final AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2 = AhwBna().fJNWhG();
        if (abstractC8664bGwFJNWhG2 != null) {
            if (!AYXKKw(true)) {
                if (this.fetchVPNInfo && (abstractC8664bGwFJNWhG = AhwBna().fJNWhG()) != null && (abstractC12782ctVDUDNAs = abstractC8664bGwFJNWhG.dUDNAs()) != null && abstractC12782ctVDUDNAs.getFieldNames()) {
                    djBIcL(true);
                } else {
                    djBIcL(false);
                    return;
                }
            }
            if (abstractC8664bGwFJNWhG2.DCUTEIdCUTEI()) {
                showLoadingAtOnce();
                AbstractC58185ywX abstractC58185ywXPreExecTransaction$default = AbstractC8664bGw.preExecTransaction$default(abstractC8664bGwFJNWhG2, true, null, 2, null);
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXPreExecTransaction$default, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
                final Function1 function1 = new Function1() { // from class: o.goa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20775gnJ.copydefault(this.AEQbTJ, abstractC8664bGwFJNWhG2, (kotlin.Pair) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gnY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20775gnJ.copydefault(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.gob
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20775gnJ.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gnZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20775gnJ.djBIcL(function12, obj);
                    }
                });
                return;
            }
            OLrzqt(abstractC8664bGwFJNWhG2);
        }
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C20775gnJ c20775gnJ, AbstractC8664bGw abstractC8664bGw, kotlin.Pair pair) {
        c20775gnJ.dismissLoading();
        boolean zBooleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        java.lang.String str = (java.lang.String) pair.component2();
        if (zBooleanValue) {
            c20775gnJ.OLrzqt((AbstractC8664bGw<?, ?>) abstractC8664bGw);
        } else if (str != null) {
            C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C20775gnJ c20775gnJ, java.lang.Throwable th) {
        c20775gnJ.dismissLoading();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("OKTransferAmountFragment", th);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractC8664bGw<?, ?> abstractC8664bGw) {
        C9694baS.Application application = C9694baS.Companion;
        fXY.Application application2 = fXY.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        application.KWHzl(this, application2.EZpvd(context, abstractC8664bGw, getArguments()), new Function2() { // from class: o.gnR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20775gnJ.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit OLrzqt(C20775gnJ c20775gnJ, int i, android.content.Intent intent) {
        FragmentActivity activity;
        if (i == -1 && (activity = c20775gnJ.getActivity()) != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        C8497bDo c8497bDoUlJrfe;
        AbstractC58185ywX<java.util.Collection<AbstractC9832bcy>> abstractC58185ywXAEQbTJ;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = AhwBna().fJNWhG();
        this.AkhnZx = (abstractC8664bGwFJNWhG == null || (c8497bDoUlJrfe = abstractC8664bGwFJNWhG.UlJrfe()) == null || (abstractC58185ywXAEQbTJ = c8497bDoUlJrfe.AEQbTJ()) == null) ? null : yBI.subscribeBy$default(abstractC58185ywXAEQbTJ, (Function1) null, (Function0) null, new Function1() { // from class: o.gnS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20775gnJ.KWHzl(this.EZpvd, (java.util.Collection) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C20775gnJ c20775gnJ, java.util.Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        c20775gnJ.AYXKKw(false);
        c20775gnJ.EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fYd.formatAssetCoinAmount$default(o.fYd, long, java.lang.String, boolean, boolean, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v32, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [o.bCW] */
    /* JADX WARN: Type inference failed for: r13v5, types: [o.bCW] */
    /* JADX WARN: Type inference failed for: r17v2, types: [o.bCW] */
    /* JADX WARN: Type inference failed for: r17v3, types: [o.bCW] */
    @Override // o.AbstractC20799gnh
    public boolean AYXKKw(boolean z) {
        C8497bDo c8497bDoUlJrfe;
        C9754bbZ c9754bbZ;
        java.lang.String strCopydefault;
        C8497bDo c8497bDoUlJrfe2;
        C9829bcv c9829bcv;
        java.lang.String strCopydefault2;
        java.lang.String strCopydefault3;
        java.lang.String toFeeCoinAmount$default;
        this.fetchVPNInfo = false;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = AhwBna().fJNWhG();
        if (abstractC8664bGwFJNWhG == null) {
            return false;
        }
        java.lang.String strAuCTel = AhwBna().AuCTel();
        if (C33129mqd.valueOf(strAuCTel, 0)) {
            if (!z && !abstractC8664bGwFJNWhG.C_() && !abstractC8664bGwFJNWhG.dHguZz().QkdxfA()) {
                setAmtErrInfo$default(this, false, false, null, false, false, null, 62, null);
                return true;
            }
            if (!abstractC8664bGwFJNWhG.dHguZz().QkdxfA()) {
                java.lang.String string = getString(C13754dXa.FragmentManager.QsIRgs);
                Intrinsics.checkNotNullExpressionValue(string, "");
                setAmtErrInfo$default(this, true, false, string, false, false, null, 56, null);
                KWHzl("amount_zero_error");
                return false;
            }
        }
        java.lang.String strAwvSrB = AhwBna().AwvSrB();
        if (C33129mqd.AEQbTJ(strAwvSrB, 0) && C33129mqd.gEmmrt(strAuCTel, strAwvSrB)) {
            setAmtErrInfo$default(this, true, false, pTD.copydefault(this, C13754dXa.FragmentManager.IntentSenderRequestBuilder, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strAwvSrB), C56390yDp.OLrzqt("currency", C14731dqw.AEQbTJ.AEQbTJ(abstractC8664bGwFJNWhG.fHqPtx().fJNWhG(), 12)))), false, false, null, 56, null);
            KWHzl("too_small_amount_for_exchange_transfer");
            return false;
        }
        java.util.Collection<AbstractC9832bcy> collectionValues = abstractC8664bGwFJNWhG.UlJrfe().copydefault().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collectionValues);
        if (abstractC9832bcy instanceof C9813bcf) {
            java.lang.String strAEQbTJ = C14731dqw.AEQbTJ.AEQbTJ(abstractC8664bGwFJNWhG.fHqPtx().fJNWhG(), 12);
            if (abstractC8664bGwFJNWhG instanceof C12319ckh) {
                toFeeCoinAmount$default = ((C9813bcf) abstractC9832bcy).copydefault();
            } else {
                toFeeCoinAmount$default = AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8664bGwFJNWhG.QKudOq(), ((C9813bcf) abstractC9832bcy).copydefault(), false, false, false, 10, null);
            }
            setAmtErrInfo$default(this, true, false, pTD.copydefault(this, C13754dXa.FragmentManager.dispatchKeyShortcutEvent, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, toFeeCoinAmount$default), C56390yDp.OLrzqt("currency", strAEQbTJ))), false, false, null, 56, null);
            KWHzl("btc_dust_error");
            return false;
        }
        if (abstractC9832bcy instanceof C9817bcj) {
            setAmtErrInfo$default(this, true, false, ((C9817bcj) abstractC9832bcy).OLrzqt(), false, false, null, 56, null);
            KWHzl("btc_dust_error");
            return false;
        }
        if (abstractC9832bcy instanceof C9865bde) {
            setAmtErrInfo$default(this, true, false, pTD.copydefault(this, C13754dXa.FragmentManager.AppCompatDelegateImplAppCompatWindowCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ((C9865bde) abstractC9832bcy).KWHzl()))), false, false, null, 56, null);
            KWHzl("near_error");
            return false;
        }
        if (abstractC9832bcy instanceof C9797bcP) {
            setAmtErrInfo$default(this, true, false, pTD.copydefault(this, C13754dXa.FragmentManager.dispatchKeyShortcutEvent, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C54870xYj.KWHzl(((C9797bcP) abstractC9832bcy).AEQbTJ(), abstractC8664bGwFJNWhG.dHguZz().valueOf(), abstractC8664bGwFJNWhG.dHguZz().fZBcTu(), null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null)), C56390yDp.OLrzqt("currency", C14731dqw.AEQbTJ.AEQbTJ(abstractC8664bGwFJNWhG.dHguZz().fJNWhG(), 12)))), false, false, null, 56, null);
            return false;
        }
        if (abstractC9832bcy instanceof C9869bdi) {
            setAmtErrInfo$default(this, true, false, pTD.copydefault(this, C13754dXa.FragmentManager.AppCompatDelegateImpl5, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ((C9869bdi) abstractC9832bcy).AEQbTJ()))), false, false, null, 56, null);
            return false;
        }
        if (AhwBna().hDKMBd()) {
            if (!AhwBna().EZpvd()) {
                setAmtErrInfo$default(this, true, true, isConnected(), false, false, null, 56, null);
                KWHzl("too_small_balance_for_transfer_amount");
                return false;
            }
            if (abstractC9832bcy instanceof C9822bco) {
                setAmtErrInfo$default(this, true, false, pTD.copydefault(this, C13754dXa.FragmentManager.dispatchKeyShortcutEvent, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8664bGwFJNWhG.QKudOq(), ((C9822bco) abstractC9832bcy).copydefault(), false, false, false, 10, null)), C56390yDp.OLrzqt("currency", C14731dqw.AEQbTJ.AEQbTJ(abstractC8664bGwFJNWhG.fHqPtx().fJNWhG(), 12)))), false, false, null, 56, null);
                return false;
            }
            if (!AhwBna().AEQbTJ()) {
                AbstractC8426bCW<?> abstractC8426bCWAxsJAY = AhwBna().AxsJAY();
                if (abstractC8426bCWAxsJAY == null) {
                    return false;
                }
                C8486bDd c8486bDdKWHzl = abstractC8426bCWAxsJAY.KWHzl();
                C14731dqw c14731dqw = C14731dqw.AEQbTJ;
                java.lang.String strAEQbTJ2 = c14731dqw.AEQbTJ(abstractC8426bCWAxsJAY.AYXKKw().fJNWhG(), 12);
                if (abstractC8664bGwFJNWhG.fHqPtx().DarRvM()) {
                    strCopydefault3 = pTD.copydefault(this, C13754dXa.FragmentManager.GQzpsZsQwTVT, C56424yEw.AYXKKw(C56390yDp.OLrzqt("token", c14731dqw.AEQbTJ(gEmmrt(true), 12))));
                } else if (!(c8486bDdKWHzl instanceof C9215bRQ)) {
                    strCopydefault3 = pTD.copydefault(this, C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strAEQbTJ2)));
                } else {
                    strCopydefault3 = pTD.copydefault(this, C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strAEQbTJ2)));
                }
                setAmtErrInfo$default(this, true, true, strCopydefault3, true, false, null, 48, null);
                KWHzl("remaining_balance_not_enough_for_fee");
                if (AhwBna().EZpvd()) {
                    this.fetchVPNInfo = true;
                }
                return false;
            }
            if (!AhwBna().copydefault()) {
                AbstractC11993ceZ abstractC11993ceZ = (AbstractC11993ceZ) abstractC8664bGwFJNWhG;
                java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(abstractC11993ceZ.ORxRYg(), ((C11990ceW) abstractC11993ceZ.QKudOq()).AEQbTJ()), false, null, null, 7, null);
                setAmtErrInfo$default(this, true, true, pTD.copydefault(this, C13754dXa.FragmentManager.setSelectedNavigationItem, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fiatamount", AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC11993ceZ.QKudOq(), strConvertToString$default, false, false, false, 14, null)), C56390yDp.OLrzqt("cryptoamount", AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC11993ceZ.QKudOq(), strConvertToString$default, false, false, false, 14, null)))), false, false, null, 56, null);
                return false;
            }
            if (!AhwBna().OLrzqt()) {
                if (abstractC8664bGwFJNWhG.fHqPtx().DarRvM()) {
                    AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2 = AhwBna().fJNWhG();
                    if (abstractC8664bGwFJNWhG2 == null || (c8497bDoUlJrfe2 = abstractC8664bGwFJNWhG2.UlJrfe()) == null || (c9829bcv = (C9829bcv) c8497bDoUlJrfe2.KWHzl(C56524yIo.AEQbTJ(C9829bcv.class))) == null || (strCopydefault2 = c9829bcv.copydefault()) == null) {
                        return false;
                    }
                    setAmtErrInfo$default(this, true, true, pTD.copydefault(this, C13754dXa.FragmentManager.dPkBzA, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C17946fYd.AEQbTJ.copydefault(abstractC8664bGwFJNWhG.fHqPtx().AhwBna(), strCopydefault2, false, true)), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C14731dqw.AEQbTJ.AEQbTJ(gEmmrt(true), 12)))), false, false, null, 56, null);
                } else {
                    AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG3 = AhwBna().fJNWhG();
                    if (abstractC8664bGwFJNWhG3 != null && (c8497bDoUlJrfe = abstractC8664bGwFJNWhG3.UlJrfe()) != null && (c9754bbZ = (C9754bbZ) c8497bDoUlJrfe.KWHzl(C56524yIo.AEQbTJ(C9754bbZ.class))) != null && (strCopydefault = c9754bbZ.copydefault()) != null) {
                        int i = C13754dXa.FragmentManager.gqOnQv;
                        C17946fYd c17946fYd = C17946fYd.AEQbTJ;
                        setAmtErrInfo$default(this, true, true, pTD.copydefault(this, i, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fiatamount", c17946fYd.AEQbTJ(abstractC8664bGwFJNWhG, abstractC8664bGwFJNWhG.fHqPtx().AhwBna(), strCopydefault)), C56390yDp.OLrzqt("cryptoamount", C17946fYd.formatAssetCoinAmount$default(c17946fYd, abstractC8664bGwFJNWhG.fHqPtx().AhwBna(), strCopydefault, false, true, 4, null)))), false, false, null, 56, null);
                        this.fetchVPNInfo = true;
                    }
                    return false;
                }
                KWHzl("remaining_balance_not_enough_for_fee");
                return false;
            }
            if (!AhwBna().gEmmrt() && (abstractC8664bGwFJNWhG instanceof C9615bYt)) {
                C9615bYt c9615bYt = (C9615bYt) abstractC8664bGwFJNWhG;
                setAmtErrInfo$default(this, true, false, pTD.copydefault(this, C13754dXa.FragmentManager.reopenMenu, C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C33129mqd.gEmmrt(c9615bYt.OLrzqt(true, false))), C56390yDp.OLrzqt("token", c9615bYt.dHguZz().fJNWhG()))), false, false, null, 56, null);
                KWHzl("sol_error");
                return false;
            }
            if (!AhwBna().AYXKKw() && (abstractC8664bGwFJNWhG instanceof C9615bYt)) {
                C9615bYt c9615bYt2 = (C9615bYt) abstractC8664bGwFJNWhG;
                setAmtErrInfo$default(this, true, false, pTD.copydefault(this, C13754dXa.FragmentManager.onKeyDownPanel, C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C33129mqd.gEmmrt(c9615bYt2.copydefault(true, false))), C56390yDp.OLrzqt("token", c9615bYt2.dHguZz().fJNWhG()))), false, false, null, 56, null);
                KWHzl("sol_error");
                return false;
            }
            if (!AhwBna().KWHzl() && (abstractC8664bGwFJNWhG instanceof C9443bVg)) {
                setAmtErrInfo$default(this, true, true, pTD.copydefault(this, C13754dXa.FragmentManager.onAttachedFromWindow, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ((C9443bVg) abstractC8664bGwFJNWhG).OLrzqt(true)))), false, false, null, 56, null);
                return false;
            }
            setAmtErrInfo$default(this, false, false, null, false, false, null, 62, null);
            return true;
        }
        if (!AhwBna().EZpvd()) {
            setAmtErrInfo$default(this, true, true, isConnected(), false, false, null, 56, null);
            KWHzl("too_small_balance_for_transfer_amount");
            return false;
        }
        setAmtErrInfo$default(this, false, false, null, false, false, null, 62, null);
        return true;
    }

    @Override // o.AbstractC20799gnh
    public void copydefault(@NotNull final C20863gos c20863gos) {
        Intrinsics.checkNotNullParameter(c20863gos, "");
        if (c20863gos.EZpvd() == null) {
            dismissLoading();
            boolean zKWHzl = c20863gos.KWHzl();
            java.lang.String strCopydefault = c20863gos.copydefault();
            KWHzl(zKWHzl, strCopydefault != null ? strCopydefault : "");
            return;
        }
        C20852goh c20852gohAhwBna = AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c20852gohAhwBna.EZpvd(viewLifecycleOwner, new Function0() { // from class: o.gnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20775gnJ.OLrzqt(this.KWHzl, c20863gos);
            }
        });
    }

    public static final Unit OLrzqt(final C20775gnJ c20775gnJ, C20863gos c20863gos) {
        c20775gnJ.getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.wallet.transfer.amount.OKTransferAmountFragment$$ExternalSyntheticLambda10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C20775gnJ.OLrzqt(this.OLrzqt, lifecycleOwner, event);
            }
        });
        c20775gnJ.dismissLoading();
        c20775gnJ.EZpvd(c20863gos);
        c20775gnJ.KWHzl(c20863gos.EZpvd());
        c20775gnJ.AuCTel();
        c20775gnJ.EZpvd();
        c20775gnJ.values();
        c20775gnJ.KWHzl(c20863gos);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C20775gnJ c20775gnJ, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_RESUME) {
            AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2 = c20775gnJ.AhwBna().fJNWhG();
            if (abstractC8664bGwFJNWhG2 != null) {
                AbstractC8564bFB.startLoopRefresh$default(abstractC8664bGwFJNWhG2, 0L, 1, null);
                return;
            }
            return;
        }
        if (event != Lifecycle.Event.ON_PAUSE || (abstractC8664bGwFJNWhG = c20775gnJ.AhwBna().fJNWhG()) == null) {
            return;
        }
        abstractC8664bGwFJNWhG.QkdxfA();
    }

    public final void KWHzl(final C20863gos c20863gos) {
        C32866mlf.onEvent$default("Web3Send_Landing_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.god
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20775gnJ.AEQbTJ(c20863gos, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C20863gos c20863gos, EventParamsList eventParamsList) {
        C10854bwM c10854bwMFHqPtx;
        C10854bwM c10854bwMFHqPtx2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC8664bGw<?, ?> abstractC8664bGwEZpvd = c20863gos.EZpvd();
        java.lang.String strDNCPSb = null;
        java.lang.String strFJNWhG = (abstractC8664bGwEZpvd == null || (c10854bwMFHqPtx2 = abstractC8664bGwEZpvd.fHqPtx()) == null) ? null : c10854bwMFHqPtx2.fJNWhG();
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        eventParamsList.put("token_name", strFJNWhG, false);
        AbstractC8664bGw<?, ?> abstractC8664bGwEZpvd2 = c20863gos.EZpvd();
        if (abstractC8664bGwEZpvd2 != null && (c10854bwMFHqPtx = abstractC8664bGwEZpvd2.fHqPtx()) != null) {
            strDNCPSb = c10854bwMFHqPtx.dNCPSb();
        }
        eventParamsList.put(MTCoreConstants.Protocol.KEY_PROTOCOL, strDNCPSb != null ? strDNCPSb : "", false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.gnh.isConnected()V */
    public final java.lang.String isConnected() {
        java.lang.String string = getString(C13754dXa.FragmentManager.FQMcgE);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractC20799gnh
    public void EZpvd() {
        C10854bwM c10854bwMDHguZz;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        AbstractC12782ctV abstractC12782ctVDUDNAs;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2;
        AbstractC12782ctV abstractC12782ctVDUDNAs2;
        if (valueOf().values.getVisibility() == 0 && (!this.fetchVPNInfo || (abstractC8664bGwFJNWhG2 = AhwBna().fJNWhG()) == null || (abstractC12782ctVDUDNAs2 = abstractC8664bGwFJNWhG2.dUDNAs()) == null || !abstractC12782ctVDUDNAs2.getFieldNames())) {
            djBIcL(false);
            return;
        }
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG3 = AhwBna().fJNWhG();
        if ((abstractC8664bGwFJNWhG3 == null || (c10854bwMDHguZz = abstractC8664bGwFJNWhG3.dHguZz()) == null || !c10854bwMDHguZz.QkdxfA() || ((abstractC8664bGwFJNWhG = AhwBna().fJNWhG()) != null && (abstractC12782ctVDUDNAs = abstractC8664bGwFJNWhG.dUDNAs()) != null && abstractC12782ctVDUDNAs.getFieldNames())) && C33129mqd.valueOf(AhwBna().AuCTel(), 0) && C33129mqd.valueOf(AhwBna().fARcdN(), 0)) {
            djBIcL(false);
        } else {
            djBIcL(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.gnJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAmtErrInfo$default(C20775gnJ c20775gnJ, boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAmtErrInfo");
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        boolean z6 = (i & 8) != 0 ? false : z3;
        boolean z7 = (i & 16) != 0 ? false : z4;
        if ((i & 32) != 0) {
            function0 = null;
        }
        c20775gnJ.AEQbTJ(z, z5, str2, z6, z7, function0);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0065 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.fragment.app.Fragment, o.gnJ, o.gnh] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v4, types: [o.dqw] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void AEQbTJ(boolean z, boolean z2, @NotNull java.lang.String str, final boolean z3, boolean z4, final Function0<Unit> function0) {
        final C10854bwM c10854bwMValueOf;
        java.lang.String strFJNWhG;
        ?? OLrzqt = str;
        Intrinsics.checkNotNullParameter(OLrzqt, "");
        if (z3) {
            AbstractC8426bCW<?> abstractC8426bCWAxsJAY = ((C20852goh) AhwBna()).AxsJAY();
            c10854bwMValueOf = abstractC8426bCWAxsJAY != null ? abstractC8426bCWAxsJAY.AYXKKw() : null;
        } else {
            c10854bwMValueOf = ((C20852goh) AhwBna()).valueOf();
        }
        if (z && z2 && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            final AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = ((C20852goh) AhwBna()).fJNWhG();
            ?? r7 = C14731dqw.AEQbTJ;
            AppCompatTextView appCompatTextView = valueOf().values;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            if (c10854bwMValueOf == null || (strFJNWhG = c10854bwMValueOf.fJNWhG()) == null) {
                strFJNWhG = "";
            }
            OLrzqt = r7.OLrzqt(appCompatTextView, OLrzqt, r7.AEQbTJ(strFJNWhG, 12), new Function0() { // from class: o.gnN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20775gnJ.AEQbTJ(abstractC8664bGwFJNWhG, this, c10854bwMValueOf, z3);
                }
            });
        } else if (z4) {
            valueOf().values.setOnTouchListener(null);
            final android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final android.graphics.drawable.Drawable drawableOLrzqt = C57304yfr.copydefault.OLrzqt(contextRequireContext, C13754dXa.Activity.zblBkD, C52761wXj.Activity.DQzvGN);
            if (drawableOLrzqt != null) {
                drawableOLrzqt.setBounds(0, 0, drawableOLrzqt.getIntrinsicWidth(), drawableOLrzqt.getIntrinsicHeight());
                java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(OLrzqt + "[errIcon]", new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.gnL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20775gnJ.EZpvd(contextRequireContext, (java.util.List) obj);
                    }
                }, 14, null), new java.lang.String[]{"[errIcon]"}, 0, null, false, new Function1() { // from class: o.gnV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20775gnJ.OLrzqt(drawableOLrzqt, function0, (java.util.List) obj);
                    }
                }, 14, null);
                if (charSequence != null) {
                    OLrzqt = charSequence;
                }
            }
        }
        AppCompatTextView appCompatTextView2 = valueOf().values;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        AEQbTJ(appCompatTextView2, z, OLrzqt);
    }

    public static final Unit AEQbTJ(AbstractC8664bGw abstractC8664bGw, C20775gnJ c20775gnJ, C10854bwM c10854bwM, boolean z) {
        java.lang.String address;
        java.util.ArrayList arrayListCopydefault;
        ChainAddress chainAddressAddressFromAddress$default;
        ChainAddress chainAddressFERRXa;
        AbstractC12782ctV abstractC12782ctVDUDNAs = abstractC8664bGw != null ? abstractC8664bGw.dUDNAs() : null;
        if (abstractC8664bGw == null || (chainAddressFERRXa = abstractC8664bGw.fERRXa()) == null || (address = chainAddressFERRXa.getAddress()) == null) {
            address = "";
        }
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity fragmentActivityRequireActivity = c20775gnJ.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null);
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.OLrzqt() : null);
        if (z) {
            arrayListCopydefault = yDY.copydefault("dex");
        } else {
            arrayListCopydefault = yDY.copydefault("gas_station");
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(strGEmmrt, strGEmmrt2, "wallet", "balance", arrayListCopydefault, (java.util.ArrayList) null, false, (java.lang.String) null, (abstractC12782ctVDUDNAs == null || (chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctVDUDNAs, address, null, 2, null)) == null) ? -1 : chainAddressAddressFromAddress$default.getAddressType(), 224, (DefaultConstructorMarker) null), 0, new Function1() { // from class: o.goc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20775gnJ.OLrzqt((WalletRechargeResult) obj);
            }
        }, 4, null);
        if (z) {
            C32866mlf.onEvent$default("Web3WalletSend_Activities_FillUpGas_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("Web3WalletSend_Activities_FillUpCryptos_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(WalletRechargeResult walletRechargeResult) {
        Intrinsics.checkNotNullParameter(walletRechargeResult, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.DQzvGN)));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.graphics.drawable.Drawable drawable, Function0 function0, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new C57306yft(drawable, C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), 0, 4, null));
        list.add(new Dialog(function0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gnJ$Dialog */
    public static final class Dialog extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> copydefault;

        public Dialog(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setHighlightColor(0);
            }
            Function0<Unit> function0 = this.copydefault;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void fARcdN() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = AhwBna().fJNWhG();
        final AbstractC11993ceZ abstractC11993ceZ = abstractC8664bGwFJNWhG instanceof AbstractC11993ceZ ? (AbstractC11993ceZ) abstractC8664bGwFJNWhG : null;
        if (abstractC11993ceZ != null) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXHCLrkq = abstractC11993ceZ.hCLrkq();
            final Function1 function1 = new Function1() { // from class: o.gnO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20775gnJ.KWHzl(this.AEQbTJ, abstractC11993ceZ, (java.lang.Boolean) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXHCLrkq.KWHzl(new InterfaceC58229yxO() { // from class: o.gnQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C20775gnJ.valueOf(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.gnT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20775gnJ.KWHzl(abstractC11993ceZ, (kotlin.Pair) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) new InterfaceC58227yxM() { // from class: o.gnX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20775gnJ.gEmmrt(function12, obj);
                }
            });
        }
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C20775gnJ c20775gnJ, AbstractC11993ceZ abstractC11993ceZ, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        c20775gnJ.KWHzl(abstractC11993ceZ);
        return abstractC11993ceZ.DsrFlB();
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC11993ceZ abstractC11993ceZ, kotlin.Pair pair) {
        abstractC11993ceZ.QkdxfA();
        abstractC11993ceZ.KWHzl(0L);
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        C10854bwM c10854bwMFHqPtx;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = AhwBna().fJNWhG();
        if (abstractC8664bGwFJNWhG == null || (c10854bwMFHqPtx = abstractC8664bGwFJNWhG.fHqPtx()) == null || !C10854bwM.isXRCToken$default(c10854bwMFHqPtx, null, 1, null)) {
            return;
        }
        AhwBna().zuBGHE();
    }

    @Override // o.AbstractC20799gnh
    public void copydefault(int i, boolean z) {
        super.copydefault(i, z);
        if (i == 0 || i == 2) {
            AbstractC20799gnh.updateAmountAndCurrencyUI$default(this, null, false, 3, null);
            KWHzl(AhwBna().fJNWhG());
            AYXKKw(false);
            EZpvd();
            fIwbmz();
        }
    }

    @Override // o.AbstractC20799gnh, o.AbstractC57212yeE, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.AkhnZx;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void AEQbTJ(@NotNull android.widget.TextView textView, boolean z, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        textView.setVisibility(z ^ true ? 4 : 0);
        if (z) {
            textView.setText(charSequence);
        }
    }
}
