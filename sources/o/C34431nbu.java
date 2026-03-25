package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.dexkline.market.features.overview.ui.widget.CoinInfoGridCellId;
import com.okinc.dexkline.market.features.overview.ui.widget.CoinLabelInfo;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC34425nbo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34431nbu extends ConstraintLayout {
    public Function1<? super java.util.List<CoinLabelInfo>, Unit> AEQbTJ;
    public Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public Function0<Unit> OLrzqt;
    public java.util.List<CoinLabelInfo> copydefault;
    public Function0<Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34431nbu(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.EZpvd = null;
        this.OLrzqt = null;
        this.gEmmrt = null;
        this.AEQbTJ = null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:49) call: o.nbu.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34431nbu(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34431nbu(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nbr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34431nbu.OLrzqt(context, this);
            }
        });
        this.copydefault = new java.util.ArrayList();
        AppCompatImageView appCompatImageView = OLrzqt().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat = OLrzqt().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(0);
    }

    private final C36083oOq OLrzqt() {
        return (C36083oOq) this.KWHzl.getValue();
    }

    public static final C36083oOq OLrzqt(android.content.Context context, C34431nbu c34431nbu) {
        return C36083oOq.KWHzl(android.view.LayoutInflater.from(context), c34431nbu);
    }

    private final boolean EZpvd() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C33054mpH.AEQbTJ(context);
    }

    public final void setLabels(@NotNull C34394nbJ c34394nbJ, Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super java.util.List<CoinLabelInfo>, Unit> function12) {
        Intrinsics.checkNotNullParameter(c34394nbJ, "");
        this.EZpvd = function1;
        this.OLrzqt = function0;
        this.gEmmrt = function02;
        this.AEQbTJ = function12;
        copydefault(c34394nbJ);
        KWHzl();
    }

    private final void AEQbTJ(InterfaceC34425nbo interfaceC34425nbo) {
        if (interfaceC34425nbo instanceof InterfaceC34425nbo.Activity) {
            android.content.Context context = getContext();
            if (context != null) {
                InterfaceC34425nbo.Activity activity = (InterfaceC34425nbo.Activity) interfaceC34425nbo;
                java.lang.String string = context.getString(activity.KWHzl());
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String string2 = context.getString(activity.AEQbTJ());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                mUO.AEQbTJ(context, string, string2, C35964oKf.Fragment.dNCPSb);
                return;
            }
            return;
        }
        if (interfaceC34425nbo instanceof InterfaceC34425nbo.Application) {
            android.content.Context context2 = getContext();
            if (context2 != null) {
                InterfaceC34425nbo.Application application = (InterfaceC34425nbo.Application) interfaceC34425nbo;
                mUO.AEQbTJ(context2, application.OLrzqt(), application.AEQbTJ(), C35964oKf.Fragment.dNCPSb);
                return;
            }
            return;
        }
        if (interfaceC34425nbo instanceof InterfaceC34425nbo.StateListAnimator) {
            Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                InterfaceC34425nbo.StateListAnimator stateListAnimator = (InterfaceC34425nbo.StateListAnimator) interfaceC34425nbo;
                function1.invoke(C56390yDp.OLrzqt(java.lang.Integer.valueOf(stateListAnimator.copydefault()), java.lang.Integer.valueOf(stateListAnimator.EZpvd())));
                return;
            }
            return;
        }
        if (interfaceC34425nbo instanceof InterfaceC34425nbo.TaskDescription) {
            InterfaceC34425nbo.TaskDescription taskDescription = (InterfaceC34425nbo.TaskDescription) interfaceC34425nbo;
            int iCopydefault = taskDescription.copydefault();
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            C32237mUo.copyAddress$default(iCopydefault, context3, taskDescription.OLrzqt(), null, 8, null);
            return;
        }
        if (!(interfaceC34425nbo instanceof InterfaceC34425nbo.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        ((InterfaceC34425nbo.ActionBar) interfaceC34425nbo).AEQbTJ().invoke();
    }

    public final void copydefault(C34394nbJ c34394nbJ) {
        TagMeta tagMetaAEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C36083oOq c36083oOqOLrzqt = OLrzqt();
        java.lang.String str = "--";
        if (c34394nbJ.AYXKKw() != null) {
            C34423nbm c34423nbmEZpvd = EZpvd(c34394nbJ.AhwBna(), c34394nbJ.AYXKKw());
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.sbu);
            TagWrapper tagWrapperAhwBna = c34394nbJ.AhwBna();
            java.lang.String strKWHzl = (tagWrapperAhwBna == null || (tagMetaAEQbTJ = tagWrapperAhwBna.AEQbTJ()) == null) ? null : tagMetaAEQbTJ.KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                strKWHzl = "--";
            }
            arrayList.add(C34391nbG.copydefault(c34423nbmEZpvd, strAYXKKw, strKWHzl));
            c36083oOqOLrzqt.AYXKKw.setData(c34423nbmEZpvd);
        }
        TagWrapper tagWrapperGEmmrt = c34394nbJ.gEmmrt();
        if (tagWrapperGEmmrt != null) {
            C34423nbm c34423nbmCopydefault = copydefault(c34394nbJ.gEmmrt(), c34394nbJ.copydefault());
            TagMeta tagMetaAEQbTJ2 = tagWrapperGEmmrt.AEQbTJ();
            java.lang.String strDbNXlk = tagMetaAEQbTJ2 != null ? tagMetaAEQbTJ2.DbNXlk() : null;
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKsuEgdN);
            if (strDbNXlk == null || strDbNXlk.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) {
                strDbNXlk = strAYXKKw2;
            }
            TagMeta tagMetaAEQbTJ3 = tagWrapperGEmmrt.AEQbTJ();
            java.lang.String strKWHzl2 = tagMetaAEQbTJ3 != null ? tagMetaAEQbTJ3.KWHzl() : null;
            if (strKWHzl2 == null || strKWHzl2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl2)) {
                strKWHzl2 = "--";
            }
            arrayList.add(C34391nbG.copydefault(c34423nbmCopydefault, strDbNXlk, strKWHzl2));
            c36083oOqOLrzqt.copydefault.setData(c34423nbmCopydefault);
        }
        TagWrapper tagWrapperEZpvd = c34394nbJ.EZpvd();
        if (tagWrapperEZpvd != null) {
            C34423nbm c34423nbmEZpvd2 = EZpvd(c34394nbJ.EZpvd());
            TagMeta tagMetaAEQbTJ4 = tagWrapperEZpvd.AEQbTJ();
            java.lang.String strDbNXlk2 = tagMetaAEQbTJ4 != null ? tagMetaAEQbTJ4.DbNXlk() : null;
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKsfEqpH);
            if (strDbNXlk2 == null || strDbNXlk2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk2)) {
                strDbNXlk2 = strAYXKKw3;
            }
            TagMeta tagMetaAEQbTJ5 = tagWrapperEZpvd.AEQbTJ();
            java.lang.String strKWHzl3 = tagMetaAEQbTJ5 != null ? tagMetaAEQbTJ5.KWHzl() : null;
            if (strKWHzl3 == null || strKWHzl3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl3)) {
                strKWHzl3 = "--";
            }
            arrayList.add(C34391nbG.copydefault(c34423nbmEZpvd2, strDbNXlk2, strKWHzl3));
            c36083oOqOLrzqt.valueOf.setData(c34423nbmEZpvd2);
            c36083oOqOLrzqt.valueOf.setOnCellAction(new Function1() { // from class: o.nbz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34431nbu.KWHzl(this.EZpvd, (InterfaceC34425nbo) obj);
                }
            });
        }
        TagWrapper tagWrapperKWHzl = c34394nbJ.KWHzl();
        if (tagWrapperKWHzl != null) {
            C34423nbm c34423nbmKWHzl = KWHzl(c34394nbJ.KWHzl());
            TagMeta tagMetaAEQbTJ6 = tagWrapperKWHzl.AEQbTJ();
            java.lang.String strDbNXlk3 = tagMetaAEQbTJ6 != null ? tagMetaAEQbTJ6.DbNXlk() : null;
            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C35964oKf.Fragment.dzCpvv);
            if (strDbNXlk3 == null || strDbNXlk3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk3)) {
                strDbNXlk3 = strAYXKKw4;
            }
            TagMeta tagMetaAEQbTJ7 = tagWrapperKWHzl.AEQbTJ();
            java.lang.String strKWHzl4 = tagMetaAEQbTJ7 != null ? tagMetaAEQbTJ7.KWHzl() : null;
            if (strKWHzl4 != null && strKWHzl4.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl4)) {
                str = strKWHzl4;
            }
            arrayList.add(C34391nbG.copydefault(c34423nbmKWHzl, strDbNXlk3, str));
            c36083oOqOLrzqt.EZpvd.setData(c34423nbmKWHzl);
        }
        if (c34394nbJ.OLrzqt() != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c34394nbJ.AEQbTJ())) {
                c36083oOqOLrzqt.AhwBna.setData(KWHzl(c34394nbJ.OLrzqt(), c34394nbJ.AEQbTJ()));
            } else {
                C34393nbI c34393nbI = c36083oOqOLrzqt.AhwBna;
                Intrinsics.checkNotNullExpressionValue(c34393nbI, "");
                c34393nbI.setVisibility(8);
            }
        }
        this.copydefault = arrayList;
    }

    public static final Unit KWHzl(C34431nbu c34431nbu, InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        c34431nbu.AEQbTJ(interfaceC34425nbo);
        return Unit.INSTANCE;
    }

    public final C34423nbm EZpvd(TagWrapper tagWrapper, java.lang.String str) {
        int iCopydefault;
        java.lang.String percentWithoutSymbol$default;
        TagMeta tagMetaAEQbTJ;
        java.lang.String strDivCheckS$default;
        if (C33129mqd.djBIcL(str) >= 80.0f) {
            iCopydefault = mUM.copydefault(C52761wXj.ActionBar.OuxcSI);
        } else {
            iCopydefault = C33129mqd.djBIcL(str) > 0.0f ? mUM.copydefault(C52761wXj.ActionBar.DCUTEI) : mUM.copydefault(C52761wXj.Activity.fdOvFl);
        }
        if (str == null || (strDivCheckS$default = mRE.divCheckS$default(str, 100, null, null, null, 14, null)) == null || (percentWithoutSymbol$default = C32163mRv.formatPercentWithoutSymbol$default(strDivCheckS$default, true, 0, null, false, null, 30, null)) == null) {
            percentWithoutSymbol$default = "--";
        }
        java.lang.String strOLrzqt = (tagWrapper == null || (tagMetaAEQbTJ = tagWrapper.AEQbTJ()) == null) ? null : C34498ndH.OLrzqt.OLrzqt(tagMetaAEQbTJ, EZpvd());
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        return new C34423nbm(CoinInfoGridCellId.TOP_10_HOLDERS, C33070mpX.AYXKKw(C35964oKf.Fragment.sbu), C34389nbE.copydefault(percentWithoutSymbol$default, iCopydefault), strOLrzqt, java.lang.Integer.valueOf(iCopydefault), null, null, null, null, LivenessCoordinator.TARGET_WIDTH, null);
    }

    public final C34423nbm copydefault(TagWrapper tagWrapper, java.lang.String str) {
        final int iCopydefault;
        java.lang.Float fOLrzqt = tagWrapper.EZpvd().KWHzl().OLrzqt();
        java.lang.String string = fOLrzqt != null ? fOLrzqt.toString() : null;
        if (str == null || str.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str = "--";
        }
        if (string == null || string.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            string = str;
        }
        final java.lang.String percentWithoutSymbol$default = Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "--") ? string : C32163mRv.formatPercentWithoutSymbol$default(string, false, 0, new BigDecimal(0.01d), false, null, 26, null);
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "--") || C33129mqd.djBIcL(string) == 0.0f) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
        } else if (C33129mqd.djBIcL(string) > 0.0f) {
            iCopydefault = mUM.copydefault(C52761wXj.ActionBar.DCUTEI);
        } else if (C33129mqd.djBIcL(string) > 0.01f) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.gdmIOq);
        } else {
            iCopydefault = C33129mqd.djBIcL(string) >= 0.1f ? mUM.copydefault(C52761wXj.ActionBar.OuxcSI) : EZpvd(string, tagWrapper, EZpvd());
        }
        return EZpvd(CoinInfoGridCellId.INSIDER, C35964oKf.Fragment.aJZHYI, tagWrapper, new Function0() { // from class: o.nbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34431nbu.AhwBna(iCopydefault);
            }
        }, new Function0() { // from class: o.nbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34431nbu.EZpvd(percentWithoutSymbol$default, iCopydefault);
            }
        });
    }

    public static final java.lang.Integer AhwBna(int i) {
        return java.lang.Integer.valueOf(i);
    }

    public static final android.text.SpannedString EZpvd(java.lang.String str, int i) {
        return C34389nbE.copydefault(str, i);
    }

    public final C34423nbm EZpvd(TagWrapper tagWrapper) {
        final int iCopydefault;
        java.lang.Integer numKWHzl = tagWrapper.EZpvd().KWHzl().KWHzl();
        boolean z = false;
        final int iIntValue = numKWHzl != null ? numKWHzl.intValue() : 0;
        java.lang.Integer numCopydefault = tagWrapper.EZpvd().KWHzl().copydefault();
        final int iIntValue2 = numCopydefault != null ? numCopydefault.intValue() : 0;
        if (iIntValue2 == 0 || iIntValue == 0) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.gdmIOq);
        }
        C34423nbm c34423nbmEZpvd = EZpvd(CoinInfoGridCellId.SNIPER, C35964oKf.Fragment.svY, tagWrapper, new Function0() { // from class: o.nbx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34431nbu.copydefault(iCopydefault);
            }
        }, new Function0() { // from class: o.nbw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34431nbu.copydefault(iIntValue, iCopydefault, this, iIntValue2);
            }
        });
        if (iIntValue > 0 && this.gEmmrt != null) {
            z = true;
        }
        return c34423nbmEZpvd.OLrzqt((191 & 1) != 0 ? c34423nbmEZpvd.KWHzl : null, (191 & 2) != 0 ? c34423nbmEZpvd.EZpvd : null, (191 & 4) != 0 ? c34423nbmEZpvd.copydefault : null, (191 & 8) != 0 ? c34423nbmEZpvd.AYXKKw : null, (191 & 16) != 0 ? c34423nbmEZpvd.AEQbTJ : null, (191 & 32) != 0 ? c34423nbmEZpvd.djBIcL : null, (191 & 64) != 0 ? c34423nbmEZpvd.AhwBna : z ? java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGUQLI) : null, (191 & 128) != 0 ? c34423nbmEZpvd.valueOf : null, (191 & 256) != 0 ? c34423nbmEZpvd.OLrzqt : z ? new InterfaceC34425nbo.ActionBar(new Function0() { // from class: o.nbC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34431nbu.OLrzqt(this.OLrzqt);
            }
        }) : null);
    }

    public static final java.lang.Integer copydefault(int i) {
        return java.lang.Integer.valueOf(i);
    }

    public static final android.text.SpannedString copydefault(int i, int i2, C34431nbu c34431nbu, int i3) {
        if (i == 0) {
            return C34389nbE.copydefault("--", i2);
        }
        C34498ndH c34498ndH = C34498ndH.OLrzqt;
        android.content.Context context = c34431nbu.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return c34498ndH.EZpvd(context, i, i3);
    }

    public static final Unit OLrzqt(C34431nbu c34431nbu) {
        Function0<Unit> function0 = c34431nbu.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final C34423nbm KWHzl(TagWrapper tagWrapper) {
        java.lang.String percentWithoutSymbol$default;
        int iCopydefault;
        java.lang.String string;
        java.lang.Float fAEQbTJ = tagWrapper.EZpvd().KWHzl().AEQbTJ();
        if (fAEQbTJ == null || (string = fAEQbTJ.toString()) == null || (percentWithoutSymbol$default = C32163mRv.formatPercentWithoutSymbol$default(string, true, 0, null, false, null, 30, null)) == null) {
            percentWithoutSymbol$default = "--";
        }
        if (fAEQbTJ == null || Intrinsics.EZpvd((java.lang.Object) percentWithoutSymbol$default, (java.lang.Object) "--")) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = fAEQbTJ.floatValue() < 0.1f ? mUM.copydefault(C52761wXj.ActionBar.DCUTEI) : -mUM.copydefault(C52761wXj.ActionBar.OuxcSI);
        }
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        java.lang.String strOLrzqt = tagMetaAEQbTJ != null ? C34498ndH.OLrzqt.OLrzqt(tagMetaAEQbTJ, EZpvd()) : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        return new C34423nbm(CoinInfoGridCellId.BUNDLER, C33070mpX.AYXKKw(C35964oKf.Fragment.dzCpvv), C34389nbE.copydefault(percentWithoutSymbol$default, iCopydefault), strOLrzqt, java.lang.Integer.valueOf(iCopydefault), null, null, null, null, LivenessCoordinator.TARGET_WIDTH, null);
    }

    public final C34423nbm KWHzl(TagWrapper tagWrapper, final java.lang.String str) {
        if (str == null) {
            str = "--";
        }
        final int iEZpvd = EZpvd(str, tagWrapper, EZpvd());
        return EZpvd(CoinInfoGridCellId.SMART_MONEY, C35964oKf.Fragment.DcMfJKgMxgjU, tagWrapper, new Function0() { // from class: o.nby
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34431nbu.KWHzl(iEZpvd);
            }
        }, new Function0() { // from class: o.nbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34431nbu.KWHzl(str, iEZpvd);
            }
        });
    }

    public static final android.text.SpannedString KWHzl(java.lang.String str, int i) {
        return C34389nbE.copydefault(str, i);
    }

    public static final java.lang.Integer KWHzl(int i) {
        return java.lang.Integer.valueOf(i);
    }

    public final C34423nbm EZpvd(CoinInfoGridCellId coinInfoGridCellId, int i, TagWrapper tagWrapper, Function0<java.lang.Integer> function0, Function0<android.text.SpannedString> function02) {
        TagMeta tagMetaAEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.String strOLrzqt = (tagWrapper == null || (tagMetaAEQbTJ = tagWrapper.AEQbTJ()) == null) ? null : C34498ndH.OLrzqt.OLrzqt(tagMetaAEQbTJ, C33054mpH.AEQbTJ(context));
        return new C34423nbm(coinInfoGridCellId, C33070mpX.AYXKKw(i), function02.invoke(), strOLrzqt == null ? "" : strOLrzqt, function0.invoke(), null, null, null, null, LivenessCoordinator.TARGET_WIDTH, null);
    }

    public final int EZpvd(java.lang.String str, TagWrapper tagWrapper, boolean z) {
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
            if ((tagWrapper != null ? tagWrapper.AEQbTJ() : null) != null) {
                C34498ndH c34498ndH = C34498ndH.OLrzqt;
                Intrinsics.copydefault(tagWrapper);
                return c34498ndH.EZpvd(tagWrapper, z, java.lang.Integer.valueOf(mUM.copydefault(C52761wXj.Activity.fdOvFl)), java.lang.Boolean.valueOf(pFN.OLrzqt.valueOf()));
            }
        }
        return mUM.copydefault(C52761wXj.Activity.DCUTEIddSDPG);
    }

    private final void KWHzl() {
        mUO.setOnDoubleCheckClickListener$default(OLrzqt().OLrzqt, 0L, new Function1() { // from class: o.nbD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34431nbu.copydefault(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(C34431nbu c34431nbu, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super java.util.List<CoinLabelInfo>, Unit> function1 = c34431nbu.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c34431nbu.copydefault);
        }
        return Unit.INSTANCE;
    }
}
