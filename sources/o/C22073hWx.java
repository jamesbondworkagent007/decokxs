package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C22073hWx extends android.widget.FrameLayout {
    public C22034hVl AEQbTJ;
    public java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public hFD KWHzl;
    public final java.lang.String OLrzqt;
    public boolean copydefault;
    public Function0<Unit> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22073hWx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = "more_tag";
        this.OLrzqt = "un_more_tag";
        this.AhwBna = "";
        OLrzqt(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22073hWx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22073hWx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22073hWx(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void OLrzqt(final android.content.Context context) {
        final hFD hfdCopydefault = hFD.copydefault(android.view.LayoutInflater.from(context), this, true);
        this.KWHzl = hfdCopydefault;
        if (hfdCopydefault != null) {
            hfdCopydefault.AhwBna.setTag(C23274hvD.Application.RXdAnZ, this.EZpvd);
            C25352ivB.setOnDoubleCheckClickListener$default(hfdCopydefault.AhwBna, 0L, new Function1() { // from class: o.hWy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22073hWx.EZpvd(this.EZpvd, hfdCopydefault, (android.view.View) obj);
                }
            }, 1, null);
            AppCompatTextView appCompatTextView = hfdCopydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            C25352ivB.setCompoundDrawables$default(appCompatTextView, C52761wXj.TaskDescription.onProviderDisabled, C33070mpX.OLrzqt(C32113mPz.StateListAnimator.fetchVPNInfo), true, null, 16, null);
            C25352ivB.setOnDoubleCheckClickListener$default(hfdCopydefault.copydefault, 0L, new Function1() { // from class: o.hWw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22073hWx.EZpvd(this.OLrzqt, context, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit EZpvd(C22073hWx c22073hWx, hFD hfd, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        boolean zEZpvd = Intrinsics.EZpvd(hfd.AhwBna.getTag(C23274hvD.Application.RXdAnZ), (java.lang.Object) c22073hWx.EZpvd);
        c22073hWx.copydefault = zEZpvd;
        C22034hVl c22034hVl = c22073hWx.AEQbTJ;
        if (c22034hVl != null) {
            c22073hWx.setDescInfoView(c22034hVl, zEZpvd);
        }
        hfd.AhwBna.setTag(C23274hvD.Application.RXdAnZ, c22073hWx.copydefault ? c22073hWx.OLrzqt : c22073hWx.EZpvd);
        AppCompatTextView appCompatTextView = hfd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C25352ivB.setCompoundDrawables$default(appCompatTextView, c22073hWx.copydefault ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG, C33070mpX.OLrzqt(C32113mPz.StateListAnimator.AkhnZx), true, null, 16, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(C22073hWx c22073hWx, android.content.Context context, android.view.View view) {
        final C22034hVl c22034hVl;
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String str = c22073hWx.AhwBna;
        int iHashCode = str.hashCode();
        if (iHashCode != -292211420) {
            if (iHashCode != -46697598) {
                if (iHashCode == 116079 && str.equals("url")) {
                    ((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).copydefault(context, C22003hUh.Companion.OLrzqt());
                }
            } else if (str.equals("shadow_assets")) {
                Function0<Unit> function0 = c22073hWx.valueOf;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            c22034hVl = c22073hWx.AEQbTJ;
            if (c22034hVl != null) {
                C32866mlf.onEvent$default("DEXHistoryDetail_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hWz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C22073hWx.EZpvd(c22034hVl, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
            C25352ivB.OLrzqt(context, c22073hWx.AhwBna);
        } else if (!str.equals("facet_redeem")) {
            c22034hVl = c22073hWx.AEQbTJ;
            if (c22034hVl != null) {
            }
            C25352ivB.OLrzqt(context, c22073hWx.AhwBna);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C22034hVl c22034hVl, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "wallet_address", c22034hVl.AEQbTJ().copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, c22034hVl.AEQbTJ().EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, C25352ivB.KWHzl(c22034hVl.AEQbTJ().KWHzl()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void setDescInfoView(C22034hVl c22034hVl, boolean z) {
        java.util.List<java.lang.String> listKWHzl = c22034hVl.KWHzl();
        hFD hfd = this.KWHzl;
        if (hfd != null) {
            if (z) {
                hfd.AYXKKw.setText(c22034hVl.EZpvd());
                hfd.AYXKKw.setVisibility(0);
                hfd.gEmmrt.setVisibility(8);
                java.lang.Integer numValueOf = listKWHzl != null ? java.lang.Integer.valueOf(listKWHzl.size()) : null;
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    hfd.AYXKKw.setText(c22034hVl.EZpvd());
                    hfd.AYXKKw.setVisibility(0);
                    hfd.KWHzl.setText(listKWHzl.get(0));
                    hfd.KWHzl.setVisibility(0);
                } else if (numValueOf != null && numValueOf.intValue() == 2) {
                    hfd.AYXKKw.setText(c22034hVl.EZpvd());
                    hfd.AYXKKw.setVisibility(0);
                    hfd.KWHzl.setText(listKWHzl.get(0));
                    hfd.KWHzl.setVisibility(0);
                    hfd.EZpvd.setText(listKWHzl.get(1));
                    hfd.EZpvd.setVisibility(0);
                } else if (numValueOf != null && numValueOf.intValue() == 3) {
                    hfd.AYXKKw.setText(c22034hVl.EZpvd());
                    hfd.AYXKKw.setVisibility(0);
                    hfd.KWHzl.setText(listKWHzl.get(0));
                    hfd.KWHzl.setVisibility(0);
                    hfd.EZpvd.setText(listKWHzl.get(1));
                    hfd.EZpvd.setVisibility(0);
                    hfd.OLrzqt.setText(listKWHzl.get(2));
                    hfd.OLrzqt.setVisibility(0);
                } else if (numValueOf != null) {
                    numValueOf.intValue();
                }
                hfd.AhwBna.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.adwzgZ));
                return;
            }
            hfd.gEmmrt.setText(c22034hVl.EZpvd());
            hfd.gEmmrt.setVisibility(0);
            hfd.AYXKKw.setVisibility(8);
            hfd.KWHzl.setVisibility(8);
            hfd.EZpvd.setVisibility(8);
            hfd.OLrzqt.setVisibility(8);
            hfd.AhwBna.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.OKSWiw));
        }
    }

    public static /* synthetic */ void initData$default(C22073hWx c22073hWx, C22034hVl c22034hVl, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initData");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c22073hWx.copydefault(c22034hVl, z, (Function0<Unit>) function0);
    }

    public final void copydefault(@NotNull C22034hVl c22034hVl, boolean z, Function0<Unit> function0) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(c22034hVl, "");
        this.AEQbTJ = c22034hVl;
        this.valueOf = function0;
        hFD hfd = this.KWHzl;
        if (hfd != null) {
            if (c22034hVl.values()) {
                strEZpvd = "shadow_assets";
            } else {
                strEZpvd = c22034hVl.AhwBna() ? "facet_redeem" : EZpvd(c22034hVl.copydefault());
            }
            this.AhwBna = strEZpvd;
            hfd.copydefault.setText(c22034hVl.OLrzqt());
            setShowMoreView(c22034hVl, z);
            hfd.copydefault.setVisibility(c22034hVl.AYXKKw() ? 0 : 8);
        }
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? str : "url";
    }

    public static /* synthetic */ boolean calculateTextShowMore$default(C22073hWx c22073hWx, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateTextShowMore");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return c22073hWx.EZpvd(str, z);
    }

    public final boolean EZpvd(java.lang.String str, boolean z) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        hFD hfd = this.KWHzl;
        if (hfd != null && (appCompatTextView2 = hfd.AEQbTJ) != null) {
            appCompatTextView2.setText(str);
        }
        hFD hfd2 = this.KWHzl;
        java.lang.Float fValueOf = (hfd2 == null || (appCompatTextView = hfd2.AEQbTJ) == null) ? null : java.lang.Float.valueOf(C25352ivB.OLrzqt(appCompatTextView));
        return C23313hvq.EZpvd(fValueOf != null ? C23313hvq.subCheckS$default(fValueOf, C23313hvq.subCheckS$default(C23313hvq.mulCheckS$default(java.lang.Integer.valueOf(MS.AEQbTJ(getContext())), 3, null, null, null, 14, null), C23313hvq.mulCheckS$default(java.lang.Integer.valueOf(C55298xhM.dp2px$default(z ? 72.0f : 120.0f, null, 1, null)), 3, null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null) : null, 0);
    }

    public static /* synthetic */ void setShowMoreView$default(C22073hWx c22073hWx, C22034hVl c22034hVl, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShowMoreView");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c22073hWx.setShowMoreView(c22034hVl, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setShowMoreView(C22034hVl c22034hVl, boolean z) {
        boolean zEZpvd;
        hFD hfd = this.KWHzl;
        if (hfd != null) {
            java.util.List<java.lang.String> listKWHzl = c22034hVl.KWHzl();
            int size = listKWHzl != null ? listKWHzl.size() : 0;
            if (size != 0) {
                zEZpvd = true;
                if (size == 1) {
                    hfd.gEmmrt.setText(c22034hVl.EZpvd());
                    zEZpvd = EZpvd(c22034hVl.EZpvd(), z);
                } else {
                    hfd.gEmmrt.setText(c22034hVl.EZpvd());
                }
            }
            hfd.AhwBna.setVisibility(zEZpvd ? 0 : 8);
        }
    }
}
