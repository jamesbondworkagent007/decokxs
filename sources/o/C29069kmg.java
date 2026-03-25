package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.overview.ui.widget.CoinInfoGridCellId;
import com.okinc.business.market.features.overview.ui.widget.CoinLabelInfo;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC29065kmc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29069kmg extends ConstraintLayout {
    public Function1<? super java.util.List<CoinLabelInfo>, Unit> AEQbTJ;
    public Function0<Unit> AYXKKw;
    public Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public java.util.List<CoinLabelInfo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29069kmg(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:49) call: o.kmg.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29069kmg(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29069kmg(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29069kmg.EZpvd(context, this);
            }
        });
        this.copydefault = new java.util.ArrayList();
        AppCompatImageView appCompatImageView = copydefault().copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat = copydefault().djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(0);
    }

    private final hFE copydefault() {
        return (hFE) this.OLrzqt.getValue();
    }

    public static final hFE EZpvd(android.content.Context context, C29069kmg c29069kmg) {
        return hFE.copydefault(android.view.LayoutInflater.from(context), c29069kmg);
    }

    public final boolean OLrzqt() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C33054mpH.AEQbTJ(context);
    }

    public final void setLabels(@NotNull C29085kmw c29085kmw, Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super java.util.List<CoinLabelInfo>, Unit> function12) {
        Intrinsics.checkNotNullParameter(c29085kmw, "");
        this.EZpvd = function1;
        this.KWHzl = function0;
        this.AYXKKw = function02;
        this.AEQbTJ = function12;
        KWHzl(c29085kmw);
        setupBottomSheet();
    }

    public final void EZpvd(InterfaceC29065kmc interfaceC29065kmc) {
        if (interfaceC29065kmc instanceof InterfaceC29065kmc.StateListAnimator) {
            android.content.Context context = getContext();
            if (context != null) {
                InterfaceC29065kmc.StateListAnimator stateListAnimator = (InterfaceC29065kmc.StateListAnimator) interfaceC29065kmc;
                java.lang.String string = context.getString(stateListAnimator.AEQbTJ());
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String string2 = context.getString(stateListAnimator.EZpvd());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                C25352ivB.OLrzqt(context, string, string2, C23274hvD.Fragment.QVAiDq);
                return;
            }
            return;
        }
        if (interfaceC29065kmc instanceof InterfaceC29065kmc.ActionBar) {
            android.content.Context context2 = getContext();
            if (context2 != null) {
                InterfaceC29065kmc.ActionBar actionBar = (InterfaceC29065kmc.ActionBar) interfaceC29065kmc;
                C25352ivB.OLrzqt(context2, actionBar.KWHzl(), actionBar.AEQbTJ(), C23274hvD.Fragment.QVAiDq);
                return;
            }
            return;
        }
        if (interfaceC29065kmc instanceof InterfaceC29065kmc.TaskDescription) {
            Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                InterfaceC29065kmc.TaskDescription taskDescription = (InterfaceC29065kmc.TaskDescription) interfaceC29065kmc;
                function1.invoke(C56390yDp.OLrzqt(java.lang.Integer.valueOf(taskDescription.AEQbTJ()), java.lang.Integer.valueOf(taskDescription.OLrzqt())));
                return;
            }
            return;
        }
        if (interfaceC29065kmc instanceof InterfaceC29065kmc.Activity) {
            InterfaceC29065kmc.Activity activity = (InterfaceC29065kmc.Activity) interfaceC29065kmc;
            int iKWHzl = activity.KWHzl();
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            hSW.copyAddress$default(iKWHzl, context3, activity.AEQbTJ(), null, null, 24, null);
            return;
        }
        if (!(interfaceC29065kmc instanceof InterfaceC29065kmc.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        ((InterfaceC29065kmc.Application) interfaceC29065kmc).EZpvd().invoke();
    }

    public final void KWHzl(C29085kmw c29085kmw) {
        TagMeta tagMetaAEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        hFE hfeCopydefault = copydefault();
        java.lang.String str = "--";
        if (c29085kmw.AYXKKw() != null) {
            C29006klW c29006klWKWHzl = KWHzl(c29085kmw.isConnected(), c29085kmw.AYXKKw());
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.IResultReceiver2);
            TagWrapper tagWrapperIsConnected = c29085kmw.isConnected();
            java.lang.String strCopydefault = (tagWrapperIsConnected == null || (tagMetaAEQbTJ = tagWrapperIsConnected.AEQbTJ()) == null) ? null : tagMetaAEQbTJ.copydefault();
            if (strCopydefault == null || strCopydefault.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
                strCopydefault = "--";
            }
            arrayList.add(C29082kmt.copydefault(c29006klWKWHzl, strAYXKKw, strCopydefault));
            hfeCopydefault.valueOf.setData(c29006klWKWHzl);
        }
        TagWrapper tagWrapperAEQbTJ = c29085kmw.AEQbTJ();
        if (tagWrapperAEQbTJ != null) {
            C29006klW c29006klWAEQbTJ = AEQbTJ(c29085kmw.AEQbTJ(), c29085kmw.copydefault(), c29085kmw.KWHzl());
            TagMeta tagMetaAEQbTJ2 = tagWrapperAEQbTJ.AEQbTJ();
            java.lang.String strDbNXlk = tagMetaAEQbTJ2 != null ? tagMetaAEQbTJ2.DbNXlk() : null;
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.onCreatePanelMenu);
            if (strDbNXlk == null || strDbNXlk.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) {
                strDbNXlk = strAYXKKw2;
            }
            TagMeta tagMetaAEQbTJ3 = tagWrapperAEQbTJ.AEQbTJ();
            java.lang.String strCopydefault2 = tagMetaAEQbTJ3 != null ? tagMetaAEQbTJ3.copydefault() : null;
            if (strCopydefault2 == null || strCopydefault2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault2)) {
                strCopydefault2 = "--";
            }
            arrayList.add(C29082kmt.copydefault(c29006klWAEQbTJ, strDbNXlk, strCopydefault2));
            hfeCopydefault.OLrzqt.setData(c29006klWAEQbTJ);
            hfeCopydefault.OLrzqt.setOnCellAction(new Function1() { // from class: o.kmm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29069kmg.copydefault(this.KWHzl, (InterfaceC29065kmc) obj);
                }
            });
        }
        TagWrapper tagWrapperGEmmrt = c29085kmw.gEmmrt();
        if (tagWrapperGEmmrt != null) {
            C29006klW c29006klWAEQbTJ2 = AEQbTJ(c29085kmw.gEmmrt(), c29085kmw.AhwBna());
            TagMeta tagMetaAEQbTJ4 = tagWrapperGEmmrt.AEQbTJ();
            java.lang.String strDbNXlk2 = tagMetaAEQbTJ4 != null ? tagMetaAEQbTJ4.DbNXlk() : null;
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.onRetainCustomNonConfigurationInstance);
            if (strDbNXlk2 == null || strDbNXlk2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk2)) {
                strDbNXlk2 = strAYXKKw3;
            }
            TagMeta tagMetaAEQbTJ5 = tagWrapperGEmmrt.AEQbTJ();
            java.lang.String strCopydefault3 = tagMetaAEQbTJ5 != null ? tagMetaAEQbTJ5.copydefault() : null;
            if (strCopydefault3 == null || strCopydefault3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault3)) {
                strCopydefault3 = "--";
            }
            arrayList.add(C29082kmt.copydefault(c29006klWAEQbTJ2, strDbNXlk2, strCopydefault3));
            hfeCopydefault.KWHzl.setData(c29006klWAEQbTJ2);
        }
        TagWrapper tagWrapperDjBIcL = c29085kmw.djBIcL();
        if (tagWrapperDjBIcL != null) {
            C29006klW c29006klWKWHzl2 = KWHzl(c29085kmw.djBIcL());
            TagMeta tagMetaAEQbTJ6 = tagWrapperDjBIcL.AEQbTJ();
            java.lang.String strDbNXlk3 = tagMetaAEQbTJ6 != null ? tagMetaAEQbTJ6.DbNXlk() : null;
            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C23274hvD.Fragment.onMenuItemSelected);
            if (strDbNXlk3 == null || strDbNXlk3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk3)) {
                strDbNXlk3 = strAYXKKw4;
            }
            TagMeta tagMetaAEQbTJ7 = tagWrapperDjBIcL.AEQbTJ();
            java.lang.String strCopydefault4 = tagMetaAEQbTJ7 != null ? tagMetaAEQbTJ7.copydefault() : null;
            if (strCopydefault4 == null || strCopydefault4.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault4)) {
                strCopydefault4 = "--";
            }
            arrayList.add(C29082kmt.copydefault(c29006klWKWHzl2, strDbNXlk3, strCopydefault4));
            hfeCopydefault.AYXKKw.setData(c29006klWKWHzl2);
            hfeCopydefault.AYXKKw.setOnCellAction(new Function1() { // from class: o.kmn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29069kmg.EZpvd(this.KWHzl, (InterfaceC29065kmc) obj);
                }
            });
        }
        TagWrapper tagWrapperOLrzqt = c29085kmw.OLrzqt();
        if (tagWrapperOLrzqt != null) {
            C29006klW c29006klWEZpvd = EZpvd(c29085kmw.OLrzqt());
            TagMeta tagMetaAEQbTJ8 = tagWrapperOLrzqt.AEQbTJ();
            java.lang.String strDbNXlk4 = tagMetaAEQbTJ8 != null ? tagMetaAEQbTJ8.DbNXlk() : null;
            java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKDIADVb);
            if (strDbNXlk4 == null || strDbNXlk4.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk4)) {
                strDbNXlk4 = strAYXKKw5;
            }
            TagMeta tagMetaAEQbTJ9 = tagWrapperOLrzqt.AEQbTJ();
            java.lang.String strCopydefault5 = tagMetaAEQbTJ9 != null ? tagMetaAEQbTJ9.copydefault() : null;
            if (strCopydefault5 != null && strCopydefault5.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault5)) {
                str = strCopydefault5;
            }
            arrayList.add(C29082kmt.copydefault(c29006klWEZpvd, strDbNXlk4, str));
            hfeCopydefault.AEQbTJ.setData(c29006klWEZpvd);
        }
        if (c29085kmw.EZpvd() != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c29085kmw.valueOf())) {
                hfeCopydefault.gEmmrt.setData(OLrzqt(c29085kmw.EZpvd(), c29085kmw.valueOf()));
            } else {
                C29040kmD c29040kmD = hfeCopydefault.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(c29040kmD, "");
                c29040kmD.setVisibility(8);
            }
        }
        this.copydefault = arrayList;
    }

    public static final Unit copydefault(C29069kmg c29069kmg, InterfaceC29065kmc interfaceC29065kmc) {
        Intrinsics.checkNotNullParameter(interfaceC29065kmc, "");
        c29069kmg.EZpvd(interfaceC29065kmc);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C29069kmg c29069kmg, InterfaceC29065kmc interfaceC29065kmc) {
        Intrinsics.checkNotNullParameter(interfaceC29065kmc, "");
        c29069kmg.EZpvd(interfaceC29065kmc);
        return Unit.INSTANCE;
    }

    public final C29006klW KWHzl(TagWrapper tagWrapper, java.lang.String str) {
        int iKWHzl;
        java.lang.String percentWithoutSymbol$default;
        TagMeta tagMetaAEQbTJ;
        java.lang.String strDivCheckS$default;
        if (C33129mqd.djBIcL(str) >= 80.0f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI);
        } else {
            iKWHzl = C33129mqd.djBIcL(str) > 0.0f ? C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI) : C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        if (str == null || (strDivCheckS$default = C23313hvq.divCheckS$default(str, 100, null, null, null, 14, null)) == null || (percentWithoutSymbol$default = C23311hvo.formatPercentWithoutSymbol$default(strDivCheckS$default, true, 0, null, false, null, 30, null)) == null) {
            percentWithoutSymbol$default = "--";
        }
        java.lang.String strKWHzl = (tagWrapper == null || (tagMetaAEQbTJ = tagWrapper.AEQbTJ()) == null) ? null : C29694kyV.AEQbTJ.KWHzl(tagMetaAEQbTJ, OLrzqt());
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        return new C29006klW(CoinInfoGridCellId.TOP_10_HOLDERS, C33070mpX.AYXKKw(C23274hvD.Fragment.IResultReceiver2), C29083kmu.copydefault(percentWithoutSymbol$default, iKWHzl), strKWHzl, java.lang.Integer.valueOf(iKWHzl), null, null, null, 224, null);
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public final C29006klW AEQbTJ(TagWrapper tagWrapper, java.lang.String str) {
        final int iKWHzl;
        java.lang.Float fValues = tagWrapper.copydefault().OLrzqt().values();
        java.lang.String string = fValues != null ? fValues.toString() : null;
        if (str == null || str.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str = "--";
        }
        if (string == null || string.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            string = str;
        }
        final java.lang.String percentWithoutSymbol$default = Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "--") ? string : C23311hvo.formatPercentWithoutSymbol$default(string, false, 0, new BigDecimal(0.01d), false, null, 26, null);
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "--") || C33129mqd.djBIcL(string) == 0.0f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        } else if (C33129mqd.djBIcL(string) > 0.0f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
        } else if (C33129mqd.djBIcL(string) > 0.01f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq);
        } else {
            iKWHzl = C33129mqd.djBIcL(string) >= 0.1f ? C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI) : copydefault(string, tagWrapper, OLrzqt());
        }
        return EZpvd(CoinInfoGridCellId.INSIDER, C23274hvD.Fragment.RjCdvp, tagWrapper, new Function0() { // from class: o.kmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29069kmg.valueOf(iKWHzl);
            }
        }, new Function0() { // from class: o.kms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29069kmg.EZpvd(percentWithoutSymbol$default, iKWHzl);
            }
        });
    }

    public static final java.lang.Integer valueOf(int i) {
        return java.lang.Integer.valueOf(i);
    }

    public static final android.text.SpannedString EZpvd(java.lang.String str, int i) {
        return C29083kmu.copydefault(str, i);
    }

    public final C29006klW KWHzl(TagWrapper tagWrapper) {
        final java.lang.Float fAhwBna = tagWrapper.copydefault().OLrzqt().AhwBna();
        java.lang.Integer numAYXKKw = tagWrapper.copydefault().OLrzqt().AYXKKw();
        boolean z = false;
        int iIntValue = numAYXKKw != null ? numAYXKKw.intValue() : 0;
        final int iKWHzl = C25382ivf.KWHzl(C28074kNy.OLrzqt(fAhwBna));
        CoinInfoGridCellId coinInfoGridCellId = CoinInfoGridCellId.SNIPER;
        C29006klW c29006klWEZpvd = EZpvd(coinInfoGridCellId, C23274hvD.Fragment.onAddQueueItem, tagWrapper, new Function0() { // from class: o.kmk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29069kmg.AEQbTJ(iKWHzl);
            }
        }, new Function0() { // from class: o.kmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29069kmg.AEQbTJ(this.EZpvd, fAhwBna);
            }
        });
        if (iIntValue > 0 && this.AYXKKw != null) {
            z = true;
        }
        return c29006klWEZpvd.copydefault((63 & 1) != 0 ? c29006klWEZpvd.OLrzqt : null, (63 & 2) != 0 ? c29006klWEZpvd.AEQbTJ : null, (63 & 4) != 0 ? c29006klWEZpvd.EZpvd : null, (63 & 8) != 0 ? c29006klWEZpvd.AhwBna : null, (63 & 16) != 0 ? c29006klWEZpvd.KWHzl : null, (63 & 32) != 0 ? c29006klWEZpvd.valueOf : null, (63 & 64) != 0 ? c29006klWEZpvd.gEmmrt : z ? java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGUQLI) : null, (63 & 128) != 0 ? c29006klWEZpvd.copydefault : z ? new InterfaceC29065kmc.Application(coinInfoGridCellId, new Function0() { // from class: o.kmo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29069kmg.OLrzqt(this.KWHzl);
            }
        }) : null);
    }

    public static final java.lang.Integer AEQbTJ(int i) {
        return java.lang.Integer.valueOf(i);
    }

    public static final android.text.SpannedString AEQbTJ(C29069kmg c29069kmg, java.lang.Float f) {
        return C29694kyV.AEQbTJ.copydefault(c29069kmg.getContext(), f);
    }

    public static final Unit OLrzqt(C29069kmg c29069kmg) {
        Function0<Unit> function0 = c29069kmg.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final C29006klW EZpvd(TagWrapper tagWrapper) {
        java.lang.String percentWithoutSymbol$default;
        int iKWHzl;
        java.lang.String string;
        java.lang.Float fOLrzqt = tagWrapper.copydefault().OLrzqt().OLrzqt();
        if (fOLrzqt == null || (string = fOLrzqt.toString()) == null || (percentWithoutSymbol$default = C23311hvo.formatPercentWithoutSymbol$default(string, true, 0, null, false, null, 30, null)) == null) {
            percentWithoutSymbol$default = "--";
        }
        if (fOLrzqt == null || Intrinsics.EZpvd((java.lang.Object) percentWithoutSymbol$default, (java.lang.Object) "--")) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        } else {
            iKWHzl = fOLrzqt.floatValue() < 0.1f ? C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI) : -C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI);
        }
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        java.lang.String strKWHzl = tagMetaAEQbTJ != null ? C29694kyV.AEQbTJ.KWHzl(tagMetaAEQbTJ, OLrzqt()) : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        return new C29006klW(CoinInfoGridCellId.BUNDLER, C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKDIADVb), C29083kmu.copydefault(percentWithoutSymbol$default, iKWHzl), strKWHzl, java.lang.Integer.valueOf(iKWHzl), null, null, null, 224, null);
    }

    public final C29006klW OLrzqt(TagWrapper tagWrapper, final java.lang.String str) {
        if (str == null) {
            str = "--";
        }
        final int iCopydefault = copydefault(str, tagWrapper, OLrzqt());
        return EZpvd(CoinInfoGridCellId.SMART_MONEY, C23274hvD.Fragment.onPanelClosed, tagWrapper, new Function0() { // from class: o.kmq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29069kmg.EZpvd(iCopydefault);
            }
        }, new Function0() { // from class: o.kmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29069kmg.copydefault(str, iCopydefault);
            }
        });
    }

    public static final android.text.SpannedString copydefault(java.lang.String str, int i) {
        return C29083kmu.copydefault(str, i);
    }

    public static final java.lang.Integer EZpvd(int i) {
        return java.lang.Integer.valueOf(i);
    }

    public final C29006klW EZpvd(CoinInfoGridCellId coinInfoGridCellId, int i, TagWrapper tagWrapper, Function0<java.lang.Integer> function0, Function0<android.text.SpannedString> function02) {
        TagMeta tagMetaAEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.String strKWHzl = (tagWrapper == null || (tagMetaAEQbTJ = tagWrapper.AEQbTJ()) == null) ? null : C29694kyV.AEQbTJ.KWHzl(tagMetaAEQbTJ, C33054mpH.AEQbTJ(context));
        return new C29006klW(coinInfoGridCellId, C33070mpX.AYXKKw(i), function02.invoke(), strKWHzl == null ? "" : strKWHzl, function0.invoke(), null, null, null, 224, null);
    }

    public final int copydefault(java.lang.String str, TagWrapper tagWrapper, boolean z) {
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
            if ((tagWrapper != null ? tagWrapper.AEQbTJ() : null) != null) {
                C29694kyV c29694kyV = C29694kyV.AEQbTJ;
                Intrinsics.copydefault(tagWrapper);
                return c29694kyV.KWHzl(tagWrapper, z, java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl)));
            }
        }
        return C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG);
    }

    public final void setupBottomSheet() {
        C25352ivB.setOnDoubleCheckClickListener$default(copydefault().copydefault, 0L, new Function1() { // from class: o.kml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29069kmg.EZpvd(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(C29069kmg c29069kmg, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super java.util.List<CoinLabelInfo>, Unit> function1 = c29069kmg.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c29069kmg.copydefault);
        }
        return Unit.INSTANCE;
    }

    public final C29006klW AEQbTJ(TagWrapper tagWrapper, java.lang.String str, TagWrapper tagWrapper2) {
        int iKWHzl;
        java.lang.String str2 = (str == null || str.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : str;
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        InterfaceC29065kmc.Application application = null;
        java.lang.String strKWHzl = tagMetaAEQbTJ != null ? C29694kyV.AEQbTJ.KWHzl(tagMetaAEQbTJ, OLrzqt()) : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        java.lang.String str3 = strKWHzl;
        java.lang.String percentWithoutSymbol$default = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "--") ? str2 : C23311hvo.formatPercentWithoutSymbol$default(str2, true, 0, new BigDecimal(1.0E-4d), false, null, 26, null);
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "--")) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        } else if (C33129mqd.djBIcL(str2) > 0.0f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
        } else {
            iKWHzl = C33129mqd.djBIcL(str2) == 0.0f ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : copydefault(str2, tagWrapper, OLrzqt());
        }
        CoinInfoGridCellId coinInfoGridCellId = CoinInfoGridCellId.DEV_HOLDINGS;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.iLWfRf);
        android.text.SpannedString spannedStringCopydefault = C29083kmu.copydefault(percentWithoutSymbol$default, iKWHzl);
        if (tagWrapper2 != null) {
            Function0<Unit> function0 = this.KWHzl;
            if (function0 == null) {
                function0 = new Function0() { // from class: o.kmi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C29069kmg.AEQbTJ();
                    }
                };
            }
            application = new InterfaceC29065kmc.Application(coinInfoGridCellId, function0);
        }
        return new C29006klW(coinInfoGridCellId, strAYXKKw, spannedStringCopydefault, str3, java.lang.Integer.valueOf(iKWHzl), null, null, application, 96, null);
    }
}
