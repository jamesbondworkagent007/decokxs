package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.wallet.home.CoinToolDialog;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC7007abF;
import o.ActivityC18047fay;
import o.ActivityC18568fkp;
import o.C10407bnq;
import o.C13754dXa;
import o.C15674eRb;
import o.C18044fav;
import o.C32113mPz;
import o.C52761wXj;
import o.C55284xgz;
import o.InterfaceC18271ffJ;
import o.InterfaceC25429iwZ;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.eRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15674eRb extends AbstractC7007abF<eUG, eUG, TaskStackBuilder, StateListAnimator> implements CoinToolDialog.Activity, C18044fav.Activity {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final android.os.Handler AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final int ejfBZ;
    public final int fARcdN;
    public final C18275ffN fIwbmz;
    public final boolean fJNWhG;
    public final java.lang.Runnable fetchVPNInfo;
    public final android.content.Context gEmmrt;
    public java.util.ArrayList<eUG> getNewProxyInstance;
    public final eUI hDKMBd;
    public final androidx.fragment.app.Fragment isConnected;
    public kotlin.Pair<java.lang.Float, java.lang.Float> iwGUEr;
    public boolean uzCIH;
    public final Function0<Unit> valueOf;
    public final androidx.fragment.app.FragmentManager values;

    /* JADX INFO: renamed from: o.eRb$PictureInPictureParams */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class PictureInPictureParams {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CoinToolDialog.Action.values().length];
            try {
                iArr[CoinToolDialog.Action.HIDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CoinToolDialog.Action.OPEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CoinToolDialog.Action.REPORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<eUG> AkhnZx() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.ArrayList<eUG> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.getNewProxyInstance = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r13v0 android.content.Context)
  (r14v0 androidx.fragment.app.FragmentManager)
  (r15v0 java.util.ArrayList)
  (r16v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:o.eUI:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.eUI) : (r18v0 o.eUI))
  (wrap:o.ffN:?: TERNARY null = ((wrap:int:0x0014: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null o.ffN) : (r19v0 o.ffN))
  (wrap:androidx.fragment.app.Fragment:?: TERNARY null = ((wrap:int:0x001c: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null androidx.fragment.app.Fragment) : (r20v0 androidx.fragment.app.Fragment))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0024: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r21v0 kotlin.jvm.functions.Function0))
 A[MD:(android.content.Context, androidx.fragment.app.FragmentManager, java.util.ArrayList<o.eUG>, int, boolean, o.eUI, o.ffN, androidx.fragment.app.Fragment, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:86) call: o.eRb.<init>(android.content.Context, androidx.fragment.app.FragmentManager, java.util.ArrayList, int, boolean, o.eUI, o.ffN, androidx.fragment.app.Fragment, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C15674eRb(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, java.util.ArrayList arrayList, int i, boolean z, eUI eui, C18275ffN c18275ffN, androidx.fragment.app.Fragment fragment, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fragmentManager, arrayList, i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : eui, (i2 & 64) != 0 ? null : c18275ffN, (i2 & 128) != 0 ? null : fragment, (i2 & 256) != 0 ? null : function0);
    }

    public C15674eRb(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<eUG> arrayList, int i, boolean z, eUI eui, C18275ffN c18275ffN, androidx.fragment.app.Fragment fragment, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.gEmmrt = context;
        this.values = fragmentManager;
        this.getNewProxyInstance = arrayList;
        this.fARcdN = i;
        this.uzCIH = z;
        this.hDKMBd = eui;
        this.fIwbmz = c18275ffN;
        this.isConnected = fragment;
        this.valueOf = function0;
        this.ejfBZ = C55298xhM.dp2px$default(50.0f, null, 1, null);
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.eQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15674eRb.KWHzl();
            }
        });
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.eRc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15674eRb.OLrzqt();
            }
        });
        this.AkhnZx = new android.os.Handler(android.os.Looper.getMainLooper());
        this.fetchVPNInfo = new java.lang.Runnable() { // from class: o.eRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15674eRb.OLrzqt(this.KWHzl);
            }
        };
        this.fJNWhG = C14687dqE.OLrzqt.isConnected();
    }

    /* JADX INFO: renamed from: o.eRb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eRb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final InterfaceC25424iwU djBIcL() {
        return (InterfaceC25424iwU) this.DbNXlk.getValue();
    }

    public static final InterfaceC25424iwU KWHzl() {
        return (InterfaceC25424iwU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25424iwU.class));
    }

    public final InterfaceC25429iwZ valueOf() {
        return (InterfaceC25429iwZ) this.AuCTel.getValue();
    }

    public static final InterfaceC25429iwZ OLrzqt() {
        return (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
    }

    public static final void OLrzqt(C15674eRb c15674eRb) {
        C18275ffN c18275ffN = c15674eRb.fIwbmz;
        if (c18275ffN != null) {
            C18275ffN.fetchKLineState$default(c18275ffN, InterfaceC18271ffJ.Application.EZpvd, null, 2, null);
        }
    }

    public final void gEmmrt() {
        this.AkhnZx.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c1  */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v39, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v42, types: [android.view.View, android.widget.TextView, o.xgS] */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.view.View, android.widget.TextView, o.xgS] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(android.view.View view, final eUG eug, boolean z, boolean z2) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String strOLrzqt;
        ?? r12;
        int i;
        java.lang.String valuationFromAsset$default;
        java.lang.String strKWHzl;
        if (eug.ejfBZ() == 4) {
            ((android.widget.TextView) view.findViewById(C13754dXa.ActionBar.invoke)).setText(C13821dZn.EZpvd.KWHzl(eug.AkhnZx()));
            return;
        }
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.znKlvJ);
        if (imageView != null) {
            imageView.setImageResource(C52761wXj.TaskDescription.aHXSQp);
        }
        if (!eug.uzCIH()) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (!eug.zsXlph()) {
                strOLrzqt = eug.gEmmrt();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(eug.AhwBna());
                if (chWlaJM == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                    str = "";
                }
                if (C9700baY.EZpvd(this.gEmmrt) && imageView != null) {
                    C14725dqq.loadFixSizeBorderImage$default(imageView, str, C52761wXj.TaskDescription.aHXSQp, 0.0f, 32.0f, C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), false, 36, null);
                }
            }
            str = strOLrzqt;
            if (C9700baY.EZpvd(this.gEmmrt)) {
                C14725dqq.loadFixSizeBorderImage$default(imageView, str, C52761wXj.TaskDescription.aHXSQp, 0.0f, 32.0f, C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), false, 36, null);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi211);
        java.lang.String ratePercent$default = null;
        if (textView != null) {
            android.text.TextPaint paint = textView.getPaint();
            int iMin = java.lang.Math.min(C11600cUg.copydefault(paint != null ? java.lang.Integer.valueOf((int) paint.measureText(eug.AhwBna().toString())) : null), this.ejfBZ);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.matchConstraintMinWidth = iMin;
            }
            textView.setLayoutParams(layoutParams2);
            textView.setText(eug.AhwBna());
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.OqHLSf);
        if (imageView2 == null) {
            r12 = 0;
            i = 8;
        } else if (eug.valueOf().length() > 0 && eug.getNewProxyInstance().length() > 0) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(null);
            r12 = 0;
            i = 8;
        } else if (eug.getFieldNames()) {
            imageView2.setVisibility(0);
            r12 = 0;
            i = 8;
            imageView2.setOnClickListener(new VoiceInteractor(imageView2, 1000L, this, eug));
        } else {
            boolean z3 = false;
            i = 8;
            if (eug.fetchVPNInfo() != 0) {
                imageView2.setVisibility(0);
                imageView2.setOnClickListener(null);
                android.graphics.drawable.Drawable drawable = imageView2.getDrawable();
                DrawableCompat.setTint(drawable, C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                imageView2.setImageDrawable(drawable);
                r12 = z3;
            } else {
                imageView2.setVisibility(8);
                imageView2.setOnClickListener(null);
                r12 = z3;
            }
        }
        ?? r10 = (C55251xgS) view.findViewById(C13754dXa.ActionBar.putString);
        if (r10 != 0) {
            if (eug.valueOf().length() > 0 && !this.fJNWhG) {
                r10.setVisibility(r12);
                r10.setText(eug.valueOf());
                r10.setOnClickListener(new SharedElementCallback(r10, 1000L, this, eug));
            } else {
                r10.setVisibility(i);
                r10.setOnClickListener(null);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.bindToGooglePlayService);
        if (textView2 != null) {
            textView2.setText(C13821dZn.EZpvd.KWHzl(eug.AkhnZx()));
        }
        ?? r0 = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.glVQsU);
        java.lang.String str2 = "--";
        if (r0 != 0) {
            r0.setVisibility((eug.fJNWhG() || eug.zsXlph() || eug.zuBGHE() || eug.wlaJM()) ? i : r12);
            r0.setText(eug.AEQbTJ().length() == 0 ? "--" : C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(eug.AEQbTJ()), null, eug.zuBGHE(), null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 21, null));
            r0.setTextColor(KWHzl(eug.isConnected()));
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.OqFWZa);
        if (imageView3 != null) {
            imageView3.setVisibility(i);
        }
        final ?? r02 = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.gsvlRV);
        if (r02 != 0) {
            r02.setVisibility(eug.fJNWhG() ? r12 : i);
            r02.setOnClickListener(new View.OnClickListener() { // from class: o.eQY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C15674eRb.EZpvd(r02, eug, view2);
                }
            });
        }
        ?? r03 = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.setShuffleModeEnabledRemoved);
        if (r03 != 0) {
            r03.setVisibility(eug.fJNWhG() ? i : r12);
            if (eug.zsXlph()) {
                strKWHzl = C13821dZn.EZpvd.KWHzl(eug.AkhnZx());
            } else {
                strKWHzl = C13821dZn.EZpvd.KWHzl(C54880xYt.formatValuationFromAsset$default(eug.DbNXlk(), null, false, 0, false, 15, null));
            }
            r03.setText(strKWHzl);
        }
        ?? r04 = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.sendMediaButton);
        if (r04 != 0) {
            r04.setVisibility((eug.fJNWhG() || eug.zsXlph() || eug.zuBGHE()) ? i : r12);
            if (eug.wlaJM()) {
                java.lang.String strFARcdN = eug.fARcdN();
                if (strFARcdN == null || strFARcdN.length() == 0) {
                    valuationFromAsset$default = "";
                } else {
                    java.lang.String strFIwbmz = eug.fIwbmz();
                    if (strFIwbmz == null || strFIwbmz.length() == 0) {
                        java.lang.String strFARcdN2 = eug.fARcdN();
                        valuationFromAsset$default = strFARcdN2 != null ? C54880xYt.formatValuationFromAsset$default(strFARcdN2, null, false, 0, false, 15, null) : null;
                    } else {
                        java.lang.String strFARcdN3 = eug.fARcdN();
                        java.lang.String str3 = C33129mqd.AEQbTJ(strFARcdN3 != null ? C33129mqd.EZpvd(strFARcdN3) : null, java.lang.Integer.valueOf((int) r12)) ? Marker.ANY_NON_NULL_MARKER : "";
                        java.lang.String strFARcdN4 = eug.fARcdN();
                        java.lang.String valuationFromAsset$default2 = strFARcdN4 != null ? C54880xYt.formatValuationFromAsset$default(strFARcdN4, null, false, 0, false, 15, null) : null;
                        valuationFromAsset$default = str3 + valuationFromAsset$default2 + "(" + C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(eug.fIwbmz()), 0, 0, false, null, null, 27, null) + ")";
                    }
                }
                r04.setText(valuationFromAsset$default);
                java.lang.String strFARcdN5 = eug.fARcdN();
                if (strFARcdN5 == null) {
                    strFARcdN5 = "";
                }
                r04.setTextColor(KWHzl(strFARcdN5));
            } else {
                if (eug.isConnected().length() != 0) {
                    str2 = "(" + C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(eug.isConnected()), 0, 0, false, null, null, 31, null) + ")";
                }
                r04.setText(str2);
                r04.setTextColor(KWHzl(eug.isConnected()));
            }
        }
        ?? r05 = (C55251xgS) view.findViewById(C13754dXa.ActionBar.gVEiQJ);
        if (r05 != 0) {
            if (!eug.sSMYrx() || !eug.AubY()) {
                if (!eug.sSMYrx()) {
                    r05.setVisibility(i);
                } else if (Intrinsics.EZpvd((java.lang.Object) eug.AhwBna(), (java.lang.Object) "USDG") && eug.hDKMBd()) {
                    r05.setVisibility(i);
                } else {
                    DeFiApyDataInfoData deFiApyDataInfoDataOLrzqt = OLrzqt(eug.AhwBna().toString(), eug.copydefault(), eug.AuCTel(), eug.hDKMBd());
                    if (C33129mqd.AEQbTJ(deFiApyDataInfoDataOLrzqt != null ? deFiApyDataInfoDataOLrzqt.getMaxApy() : null, java.lang.Integer.valueOf((int) r12))) {
                        r05.setVisibility(r12);
                        InterfaceC25429iwZ interfaceC25429iwZValueOf = valueOf();
                        if (interfaceC25429iwZValueOf != null) {
                            ratePercent$default = InterfaceC25429iwZ.TaskDescription.formatRatePercent$default(interfaceC25429iwZValueOf, deFiApyDataInfoDataOLrzqt != null ? deFiApyDataInfoDataOLrzqt.getMaxApy() : null, r12, 2, null);
                        }
                        int i2 = C13754dXa.FragmentManager.getMediaMetadata;
                        if (ratePercent$default == null) {
                            ratePercent$default = "";
                        }
                        r05.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ratePercent$default))));
                    } else {
                        r05.setVisibility(i);
                    }
                }
            }
        }
        ?? FindViewById = view.findViewById(C13754dXa.ActionBar.OAhWiU);
        if (FindViewById != 0) {
            FindViewById.setVisibility((eug.uzCIH() && z2 && z) ? r12 : i);
        }
        if (eug.AuCTelauCTel()) {
            view.setBackground(C33070mpX.KWHzl(C52761wXj.Activity.djBIcL));
        } else {
            view.setBackground(C33070mpX.KWHzl(C52761wXj.Activity.aBDePw));
        }
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.eRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view2) {
                return C15674eRb.KWHzl(this.AEQbTJ, eug, view2);
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o.eRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return C15674eRb.AEQbTJ(this.KWHzl, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: o.eRb$FragmentManager */
    public final class FragmentManager extends TaskStackBuilder {
        public final AbstractC16896esa EZpvd;
        public final /* synthetic */ C15674eRb copydefault;

        @Override // o.AbstractC7007abF.TaskDescription
        public void KWHzl(RecyclerView.Adapter<?> adapter, boolean z) {
        }

        /* JADX INFO: renamed from: o.eRb$FragmentManager$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C15674eRb OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C15674eRb c15674eRb) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.OLrzqt = c15674eRb;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Function0 function0 = this.OLrzqt.valueOf;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentManager(@NotNull C15674eRb c15674eRb, AbstractC16896esa abstractC16896esa) {
            Intrinsics.checkNotNullParameter(abstractC16896esa, "");
            this.copydefault = c15674eRb;
            android.view.View root = abstractC16896esa.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.EZpvd = abstractC16896esa;
        }

        public final void copydefault(@NotNull eUG eug) {
            Intrinsics.checkNotNullParameter(eug, "");
            this.EZpvd.AEQbTJ.setText(C13821dZn.EZpvd.OLrzqt(eug.AkhnZx()));
            wYC wyc = this.EZpvd.copydefault;
            wyc.setOnClickListener(new ActionBar(wyc, 1000L, this.copydefault));
        }
    }

    /* JADX INFO: renamed from: o.eRb$PendingIntent */
    public final class PendingIntent extends TaskStackBuilder {
        public final AbstractC16725epO EZpvd;
        public final /* synthetic */ C15674eRb KWHzl;

        @Override // o.AbstractC7007abF.TaskDescription
        public void KWHzl(RecyclerView.Adapter<?> adapter, boolean z) {
        }

        /* JADX INFO: renamed from: o.eRb$PendingIntent$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ PendingIntent OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, PendingIntent pendingIntent) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.OLrzqt = pendingIntent;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Web3_HomePage_WalletRelease_Entry_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                    ActivityC18047fay.StateListAnimator stateListAnimator = ActivityC18047fay.Companion;
                    android.content.Context context = this.OLrzqt.EZpvd.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    stateListAnimator.AEQbTJ(context);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PendingIntent(@NotNull C15674eRb c15674eRb, AbstractC16725epO abstractC16725epO) {
            Intrinsics.checkNotNullParameter(abstractC16725epO, "");
            this.KWHzl = c15674eRb;
            android.view.View root = abstractC16725epO.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.EZpvd = abstractC16725epO;
        }

        public final void OLrzqt(@NotNull eUG eug) {
            Intrinsics.checkNotNullParameter(eug, "");
            this.EZpvd.KWHzl.setStyle(0);
            this.EZpvd.KWHzl.setTitle(eug.AhwBna());
            android.view.View root = this.EZpvd.getRoot();
            root.setOnClickListener(new Activity(root, 1000L, this));
            this.EZpvd.KWHzl.setLeadingIconVisibility(false);
            this.EZpvd.KWHzl.OLrzqt().setImageResource(C52761wXj.TaskDescription.hCLrkq);
            this.EZpvd.KWHzl.OLrzqt().setBackground(null);
        }
    }

    /* JADX INFO: renamed from: o.eRb$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ eUG EZpvd;
        public final /* synthetic */ C15674eRb KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C15674eRb c15674eRb, eUG eug) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c15674eRb;
            this.EZpvd = eug;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                try {
                    this.KWHzl.values.beginTransaction().add(C15762eUi.Companion.KWHzl(this.EZpvd.valueOf(), this.EZpvd.getNewProxyInstance()), "VoucherTokenBottomSheet").commitAllowingStateLoss();
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("ExpandAdapter", "Error showing VoucherTokenBottomSheet", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eRb$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ eUG KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C15674eRb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C15674eRb c15674eRb, eUG eug) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c15674eRb;
            this.KWHzl = eug;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.values.beginTransaction().add(C15518eLh.Companion.OLrzqt(C10953byF.KWHzl.EZpvd(this.KWHzl.djBIcL())), "AnchoredTokenBottomSheet").commitAllowingStateLoss();
            }
        }
    }

    public static final void EZpvd(android.widget.TextView textView, eUG eug, android.view.View view) {
        eUG eug2;
        ActivityC18568fkp.Activity activity = ActivityC18568fkp.Companion;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.util.ArrayList<eUG> arrayListAYXKKw = eug.AYXKKw();
        java.lang.String strDjBIcL = (arrayListAYXKKw == null || (eug2 = (eUG) CollectionsKt___CollectionsKt.firstOrNull(arrayListAYXKKw)) == null) ? null : eug2.djBIcL();
        activity.AEQbTJ(context, (28 & 2) != 0 ? "" : strDjBIcL == null ? "" : strDjBIcL, (28 & 4) != 0 ? "" : null, (28 & 8) != 0 ? "" : null, (28 & 16) != 0 ? "" : null);
    }

    public static final boolean KWHzl(C15674eRb c15674eRb, eUG eug, android.view.View view) {
        Intrinsics.copydefault(view);
        c15674eRb.KWHzl(eug, view);
        return true;
    }

    public static final boolean AEQbTJ(C15674eRb c15674eRb, android.view.View view, android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        c15674eRb.iwGUEr = C56390yDp.OLrzqt(java.lang.Float.valueOf(iArr[0] + motionEvent.getX()), java.lang.Float.valueOf(iArr[1] + motionEvent.getY()));
        return false;
    }

    public final int KWHzl(java.lang.String str) {
        return C33129mqd.AEQbTJ(str, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, this.gEmmrt, 0.0f, 2, null) : C33129mqd.gEmmrt(str, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, this.gEmmrt, 0.0f, 2, null) : C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
    }

    public final void KWHzl(eUG eug, final android.view.View view) {
        MutableLiveData<java.lang.Boolean> mutableLiveDataAhwBna;
        MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> mutableLiveDataValues;
        java.lang.Object next;
        java.util.ArrayList<eUG> arrayListAYXKKw;
        int iIndexOf = this.getNewProxyInstance.indexOf(eug);
        kotlin.Pair<java.lang.Float, java.lang.Float> pair = null;
        if (iIndexOf == -1) {
            java.util.Iterator<T> it = this.getNewProxyInstance.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((eUG) next).ejfBZ() == 5) {
                        break;
                    }
                }
            }
            eUG eug2 = (eUG) next;
            iIndexOf = (eug2 == null || (arrayListAYXKKw = eug2.AYXKKw()) == null) ? -1 : arrayListAYXKKw.indexOf(eug);
            if (iIndexOf != -1) {
                iIndexOf += this.getNewProxyInstance.size();
            }
        }
        eUI eui = this.hDKMBd;
        if (eui != null && (mutableLiveDataValues = eui.values()) != null) {
            mutableLiveDataValues.setValue(C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIndexOf), eug.djBIcL()));
        }
        eUI eui2 = this.hDKMBd;
        if (eui2 != null && (mutableLiveDataAhwBna = eui2.AhwBna()) != null) {
            mutableLiveDataAhwBna.setValue(java.lang.Boolean.FALSE);
        }
        eug.OLrzqt(true);
        view.setBackground(C33070mpX.KWHzl(C52761wXj.Activity.djBIcL));
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(eug.djBIcL())));
        boolean z = c10854bwMKWHzl != null ? SPUtils.getBoolean(java.lang.String.valueOf(c10854bwMKWHzl.AhwBna()), false, "coin_report") : false;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (this.isConnected != null) {
            CoinToolDialog.StateListAnimator stateListAnimator = CoinToolDialog.Companion;
            androidx.fragment.app.FragmentManager fragmentManager = this.values;
            java.lang.String name = C15674eRb.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            kotlin.Pair<java.lang.Float, java.lang.Float> pair2 = this.iwGUEr;
            if (pair2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                pair = pair2;
            }
            stateListAnimator.copydefault(this, fragmentManager, name, (int) pair.getFirst().floatValue(), iArr[1], EopTrackEvent.CLOSE, (eug.zLjUOn() || z) ? false : true, eug, this.hDKMBd, new Function0() { // from class: o.eRf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C15674eRb.OLrzqt(view, this);
                }
            });
        }
    }

    public static final Unit OLrzqt(android.view.View view, C15674eRb c15674eRb) {
        MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> mutableLiveDataValues;
        view.setBackground(C33070mpX.KWHzl(C52761wXj.Activity.aBDePw));
        eUI eui = c15674eRb.hDKMBd;
        if (eui != null && (mutableLiveDataValues = eui.values()) != null) {
            mutableLiveDataValues.setValue(C56390yDp.OLrzqt(-1, ""));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DeFiApyDataInfoData OLrzqt(java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList, java.util.ArrayList<java.lang.Long> arrayList2, boolean z) {
        boolean z2;
        InterfaceC25424iwU interfaceC25424iwUDjBIcL;
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) arrayList2);
        if (listDjBIcL.isEmpty()) {
            return null;
        }
        if (z) {
            z2 = listDjBIcL.size() > 1;
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "USDG");
        boolean zContains = listDjBIcL.contains(25034771L);
        if (z2) {
            if (zContains) {
                InterfaceC25424iwU interfaceC25424iwUDjBIcL2 = djBIcL();
                if (interfaceC25424iwUDjBIcL2 != null) {
                    return interfaceC25424iwUDjBIcL2.AEQbTJ(25034771L);
                }
                return null;
            }
            InterfaceC25424iwU interfaceC25424iwUDjBIcL3 = djBIcL();
            if (interfaceC25424iwUDjBIcL3 != null) {
                return interfaceC25424iwUDjBIcL3.EZpvd(str, arrayList, arrayList2);
            }
            return null;
        }
        java.lang.Long l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(listDjBIcL);
        long jLongValue = l != null ? l.longValue() : -1L;
        if (zEZpvd && z) {
            if (jLongValue != 25034771 || (interfaceC25424iwUDjBIcL = djBIcL()) == null) {
                return null;
            }
            return interfaceC25424iwUDjBIcL.AEQbTJ(jLongValue);
        }
        InterfaceC25424iwU interfaceC25424iwUDjBIcL4 = djBIcL();
        if (interfaceC25424iwUDjBIcL4 != null) {
            return interfaceC25424iwUDjBIcL4.AEQbTJ(jLongValue);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.eRb$TaskStackBuilder */
    public static abstract class TaskStackBuilder extends AbstractC7007abF.TaskDescription {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskStackBuilder(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    /* JADX INFO: renamed from: o.eRb$Dialog */
    public static final class Dialog extends TaskStackBuilder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }

        @Override // o.AbstractC7007abF.TaskDescription
        public void KWHzl(RecyclerView.Adapter<?> adapter, boolean z) {
            ((android.widget.ImageView) this.itemView.findViewById(C13754dXa.ActionBar.OqFWZa)).setSelected(z);
        }
    }

    /* JADX INFO: renamed from: o.eRb$LoaderManager */
    public final class LoaderManager extends TaskStackBuilder {
        public final AbstractC16728epR AEQbTJ;
        public final /* synthetic */ C15674eRb KWHzl;

        /* JADX WARN: Illegal instructions before constructor call */
        public LoaderManager(@NotNull C15674eRb c15674eRb, AbstractC16728epR abstractC16728epR) {
            Intrinsics.checkNotNullParameter(abstractC16728epR, "");
            this.KWHzl = c15674eRb;
            android.view.View root = abstractC16728epR.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.AEQbTJ = abstractC16728epR;
        }

        @Override // o.AbstractC7007abF.TaskDescription
        public void KWHzl(RecyclerView.Adapter<?> adapter, boolean z) {
            C13912dbY.copydefault.EZpvd(z);
            this.AEQbTJ.EZpvd.setImageResource(z ? C52761wXj.TaskDescription.OTwTPd : C52761wXj.TaskDescription.call);
            if (adapter != null) {
                adapter.notifyItemChanged(getBindingAdapterPosition());
            }
        }

        public final void copydefault(@NotNull eUG eug) {
            Intrinsics.checkNotNullParameter(eug, "");
            this.AEQbTJ.copydefault.setText(eug.AhwBna());
            this.AEQbTJ.EZpvd.setImageResource(C13912dbY.copydefault.AYXKKw() ? C52761wXj.TaskDescription.OTwTPd : C52761wXj.TaskDescription.call);
        }
    }

    /* JADX INFO: renamed from: o.eRb$Fragment */
    public final class Fragment extends TaskStackBuilder {
        public final /* synthetic */ C15674eRb EZpvd;
        public final C16724epN OLrzqt;

        public final void EZpvd() {
        }

        @Override // o.AbstractC7007abF.TaskDescription
        public void KWHzl(RecyclerView.Adapter<?> adapter, boolean z) {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Fragment(@NotNull C15674eRb c15674eRb, C16724epN c16724epN) {
            Intrinsics.checkNotNullParameter(c16724epN, "");
            this.EZpvd = c15674eRb;
            ConstraintLayout root = c16724epN.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.OLrzqt = c16724epN;
        }
    }

    /* JADX INFO: renamed from: o.eRb$Application */
    public final class Application extends TaskStackBuilder {
        public final C17090ewI AEQbTJ;
        public final /* synthetic */ C15674eRb KWHzl;

        @Override // o.AbstractC7007abF.TaskDescription
        public void KWHzl(RecyclerView.Adapter<?> adapter, boolean z) {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Application(@NotNull C15674eRb c15674eRb, C17090ewI c17090ewI) {
            Intrinsics.checkNotNullParameter(c17090ewI, "");
            this.KWHzl = c15674eRb;
            ConstraintLayout root = c17090ewI.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.AEQbTJ = c17090ewI;
        }

        public final void copydefault() {
            if (((eUG) CollectionsKt___CollectionsKt.AubY(this.KWHzl.AkhnZx())).ejfBZ() == 2 || ((eUG) CollectionsKt___CollectionsKt.AubY(this.KWHzl.AkhnZx())).ejfBZ() == 3 || this.KWHzl.AhwBna()) {
                this.AEQbTJ.getRoot().setVisibility(0);
                AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
                final C15674eRb c15674eRb = this.KWHzl;
                appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: o.eRo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C15674eRb.Application.copydefault(c15674eRb, view);
                    }
                });
                return;
            }
            this.AEQbTJ.getRoot().setVisibility(4);
        }

        public static final void copydefault(C15674eRb c15674eRb, android.view.View view) {
            Function0 function0 = c15674eRb.valueOf;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.eRb$TaskDescription */
    public final class TaskDescription extends TaskStackBuilder {
        public final /* synthetic */ C15674eRb KWHzl;
        public final android.view.ViewGroup copydefault;

        @Override // o.AbstractC7007abF.TaskDescription
        public void KWHzl(RecyclerView.Adapter<?> adapter, boolean z) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C15674eRb c15674eRb, android.view.ViewGroup viewGroup) {
            super(viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.KWHzl = c15674eRb;
            this.copydefault = viewGroup;
        }

        public final void KWHzl() {
            this.copydefault.findViewById(C13754dXa.ActionBar.DxnCrt).setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: o.eRb$Activity */
    public final class Activity extends TaskStackBuilder {
        public final C16472eka EZpvd;
        public final /* synthetic */ C15674eRb OLrzqt;

        @Override // o.AbstractC7007abF.TaskDescription
        public void KWHzl(RecyclerView.Adapter<?> adapter, boolean z) {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Activity(@NotNull C15674eRb c15674eRb, C16472eka c16472eka) {
            Intrinsics.checkNotNullParameter(c16472eka, "");
            this.OLrzqt = c15674eRb;
            ConstraintLayout root = c16472eka.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.EZpvd = c16472eka;
        }

        public final void EZpvd() {
            this.EZpvd.AEQbTJ.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: o.eRb$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    @Override // o.AbstractC7007abF
    public int EZpvd() {
        return this.getNewProxyInstance.size();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(I)Lo/abF$StateListAnimator; */
    @Override // o.AbstractC7007abF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public eUG KWHzl(int i) {
        eUG eug = this.getNewProxyInstance.get(i);
        Intrinsics.checkNotNullExpressionValue(eug, "");
        return eug;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/abF$StateListAnimator;)I */
    @Override // o.AbstractC7007abF
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public int copydefault(eUG eug) {
        if (eug != null) {
            return eug.ejfBZ();
        }
        return 0;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/ViewGroup;I)Lo/abF$TaskDescription; */
    @Override // o.AbstractC7007abF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskStackBuilder copydefault(android.view.ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                C17090ewI c17090ewIOLrzqt = C17090ewI.OLrzqt(android.view.LayoutInflater.from(this.gEmmrt), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(c17090ewIOLrzqt, "");
                return new Application(this, c17090ewIOLrzqt);
            case 2:
                android.view.View viewInflate = android.view.LayoutInflater.from(this.gEmmrt).inflate(C13754dXa.TaskDescription.gZKUVK, viewGroup, false);
                Intrinsics.copydefault(viewInflate, "");
                return new TaskDescription(this, (android.view.ViewGroup) viewInflate);
            case 3:
                C16472eka c16472ekaKWHzl = C16472eka.KWHzl(android.view.LayoutInflater.from(this.gEmmrt), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(c16472ekaKWHzl, "");
                return new Activity(this, c16472ekaKWHzl);
            case 4:
                AbstractC16896esa abstractC16896esaCopydefault = AbstractC16896esa.copydefault(android.view.LayoutInflater.from(this.gEmmrt), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(abstractC16896esaCopydefault, "");
                return new FragmentManager(this, abstractC16896esaCopydefault);
            case 5:
                AbstractC16728epR abstractC16728epROLrzqt = AbstractC16728epR.OLrzqt(android.view.LayoutInflater.from(this.gEmmrt), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(abstractC16728epROLrzqt, "");
                return new LoaderManager(this, abstractC16728epROLrzqt);
            case 6:
                C16724epN c16724epNEZpvd = C16724epN.EZpvd(android.view.LayoutInflater.from(this.gEmmrt), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(c16724epNEZpvd, "");
                return new Fragment(this, c16724epNEZpvd);
            case 7:
                AbstractC16725epO abstractC16725epOAEQbTJ = AbstractC16725epO.AEQbTJ(android.view.LayoutInflater.from(this.gEmmrt), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(abstractC16725epOAEQbTJ, "");
                return new PendingIntent(this, abstractC16725epOAEQbTJ);
            default:
                android.view.View viewInflate2 = android.view.LayoutInflater.from(this.gEmmrt).inflate(C13754dXa.TaskDescription.DxnCrt, (android.view.ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(viewInflate2, "");
                return new Dialog(viewInflate2);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/abF$TaskDescription;Lo/abF$StateListAnimator;Z)V */
    @Override // o.AbstractC7007abF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(TaskStackBuilder taskStackBuilder, eUG eug, boolean z) {
        if (taskStackBuilder == null || eug == null) {
            return;
        }
        if (taskStackBuilder instanceof Dialog) {
            android.view.View view = ((Dialog) taskStackBuilder).itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            copydefault(view, eug, z, false);
            return;
        }
        if (taskStackBuilder instanceof LoaderManager) {
            ((LoaderManager) taskStackBuilder).copydefault(eug);
            return;
        }
        if (taskStackBuilder instanceof Fragment) {
            ((Fragment) taskStackBuilder).EZpvd();
            return;
        }
        if (taskStackBuilder instanceof PendingIntent) {
            ((PendingIntent) taskStackBuilder).OLrzqt(eug);
            return;
        }
        if (taskStackBuilder instanceof Application) {
            ((Application) taskStackBuilder).copydefault();
            return;
        }
        if (taskStackBuilder instanceof TaskDescription) {
            ((TaskDescription) taskStackBuilder).KWHzl();
        } else if (taskStackBuilder instanceof Activity) {
            ((Activity) taskStackBuilder).EZpvd();
        } else if (taskStackBuilder instanceof FragmentManager) {
            ((FragmentManager) taskStackBuilder).copydefault(eug);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC7007abF
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator OLrzqt(android.view.ViewGroup viewGroup, int i) {
        android.view.View viewInflate = android.view.View.inflate(this.gEmmrt, C13754dXa.TaskDescription.DxnCrt, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lo/abF$StateListAnimator;Ljava/lang/Object;)V */
    @Override // o.AbstractC7007abF
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(StateListAnimator stateListAnimator, eUG eug, eUG eug2) {
        java.util.ArrayList<eUG> arrayListAYXKKw;
        if (stateListAnimator == null || eug2 == null) {
            return;
        }
        android.view.View view = stateListAnimator.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        copydefault(view, eug2, true, Intrinsics.EZpvd((eug == null || (arrayListAYXKKw = eug.AYXKKw()) == null) ? null : (eUG) CollectionsKt___CollectionsKt.AubY(arrayListAYXKKw), eug2));
    }

    @Override // com.okinc.business.defi.wallet.home.CoinToolDialog.Activity
    public void AEQbTJ(@NotNull CoinToolDialog.Action action, @NotNull final eUG eug) {
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(eug, "");
        int i = PictureInPictureParams.OLrzqt[action.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                eSZ.Companion.AEQbTJ(0, eug, new Function0() { // from class: o.eRn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C15674eRb.copydefault(eug, this);
                    }
                }).show(this.values);
                return;
            } else {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(eug.djBIcL())));
                if (c10854bwMKWHzl != null) {
                    C11607cUn.OLrzqt(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault(c10854bwMKWHzl.OcIXYQ(), true), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.eRl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C15674eRb.valueOf((java.lang.Throwable) obj);
                        }
                    }, new Function1() { // from class: o.eRj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C15674eRb.KWHzl(this.AEQbTJ, (java.util.List) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        long jEZpvd = C10953byF.KWHzl.EZpvd(eug.djBIcL());
        if (eug.zsXlph()) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(jEZpvd);
            if (customChainCoinMetaOLrzqt != null) {
                C11607cUn.OLrzqt(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).AEQbTJ(customChainCoinMetaOLrzqt.AkhnZx(), false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.eRd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15674eRb.KWHzl((java.lang.Throwable) obj);
                    }
                }, new Function1() { // from class: o.eRi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15674eRb.AEQbTJ(this.OLrzqt, ((java.lang.Long) obj).longValue());
                    }
                });
                return;
            }
            return;
        }
        C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(jEZpvd));
        if (c10854bwMKWHzl2 != null) {
            C11607cUn.OLrzqt(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault(c10854bwMKWHzl2.OcIXYQ(), false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.eRm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15674eRb.AEQbTJ((java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.eRk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15674eRb.copydefault(this.KWHzl, (java.util.List) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(C15674eRb c15674eRb, long j) {
        eUI eui = c15674eRb.hDKMBd;
        if (eui != null) {
            eUI.requestAllHomeData$default(eui, "mainHideAsset", null, false, false, false, false, 1, false, false, null, 958, null);
        }
        c15674eRb.AkhnZx.removeCallbacks(c15674eRb.fetchVPNInfo);
        c15674eRb.AkhnZx.postDelayed(c15674eRb.fetchVPNInfo, 5000L);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C15674eRb c15674eRb, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        eUI eui = c15674eRb.hDKMBd;
        if (eui != null) {
            eUI.requestAllHomeData$default(eui, "mainHideAsset", null, false, false, false, false, 1, false, false, null, 958, null);
        }
        c15674eRb.AkhnZx.removeCallbacks(c15674eRb.fetchVPNInfo);
        c15674eRb.AkhnZx.postDelayed(c15674eRb.fetchVPNInfo, 5000L);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C15674eRb c15674eRb, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        eUI eui = c15674eRb.hDKMBd;
        if (eui != null) {
            eUI.requestAllHomeData$default(eui, "mainOpenAsset", null, false, false, false, false, 1, false, false, null, 958, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(eUG eug, C15674eRb c15674eRb) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(eug.djBIcL())));
        if (c10854bwMKWHzl != null) {
            SPUtils.put(java.lang.String.valueOf(c10854bwMKWHzl.AhwBna()), java.lang.Boolean.TRUE, "coin_report");
        }
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.content.Context context = c15674eRb.gEmmrt;
        Intrinsics.copydefault(context, "");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final C55284xgz c55284xgzAEQbTJ = activity.AEQbTJ(context, (android.view.ViewGroup) decorView, C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyDayNight));
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.isConnected(3);
            c55284xgzAEQbTJ.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyDayNight));
            c55284xgzAEQbTJ.EZpvd(new View.OnClickListener() { // from class: o.eRa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C15674eRb.OLrzqt(c55284xgzAEQbTJ, view);
                }
            });
        }
        android.view.View viewAkhnZx = c55284xgzAEQbTJ != null ? c55284xgzAEQbTJ.AkhnZx() : null;
        if (viewAkhnZx != null) {
            ViewGroup.LayoutParams layoutParams = viewAkhnZx.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, C55298xhM.dpInt$default(84, (android.content.Context) null, 1, (java.lang.Object) null));
            viewAkhnZx.setLayoutParams(marginLayoutParams);
        }
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    @Override // o.C18044fav.Activity
    public int AYXKKw() {
        java.util.Iterator<eUG> it = this.getNewProxyInstance.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().ejfBZ() == 5) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // o.C18044fav.Activity
    public void OLrzqt(@NotNull android.view.View view) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(view, "");
        java.util.Iterator<T> it = this.getNewProxyInstance.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((eUG) next).ejfBZ() == 5) {
                    break;
                }
            }
        }
        eUG eug = (eUG) next;
        if (eug != null) {
            ((android.widget.TextView) view.findViewById(C13754dXa.ActionBar.PlaybackStateCompatBuilder)).setText(eug.AhwBna());
            ((android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.OqHLSf)).setImageResource(C13912dbY.copydefault.AYXKKw() ? C52761wXj.TaskDescription.OTwTPd : C52761wXj.TaskDescription.call);
        }
    }

    @Override // o.C18044fav.Activity
    public void values() {
        java.lang.Object next;
        java.util.Iterator<T> it = this.getNewProxyInstance.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((eUG) next).ejfBZ() == 5) {
                    break;
                }
            }
        }
        eUG eug = (eUG) next;
        if (eug != null) {
            C13912dbY.copydefault.EZpvd(false);
            AEQbTJ(eug);
        }
    }
}
