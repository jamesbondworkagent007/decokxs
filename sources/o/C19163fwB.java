package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19163fwB extends RecyclerView.ViewHolder {
    public final Function1<java.lang.String, Unit> EZpvd;
    public final Function1<TagEventProperty, Unit> KWHzl;
    public final C17174exn OLrzqt;
    public final Function1<C18988fsm, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsm, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19163fwB(@NotNull C17174exn c17174exn, @NotNull Function1<? super C18988fsm, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12, @NotNull Function1<? super TagEventProperty, Unit> function13) {
        super(c17174exn.getRoot());
        Intrinsics.checkNotNullParameter(c17174exn, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.OLrzqt = c17174exn;
        this.copydefault = function1;
        this.EZpvd = function12;
        this.KWHzl = function13;
    }

    private final android.content.Context AEQbTJ() {
        android.content.Context context = this.OLrzqt.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    public final void AEQbTJ(@NotNull C18988fsm c18988fsm) {
        int iTradeFallDefault$default;
        Intrinsics.checkNotNullParameter(c18988fsm, "");
        C17174exn c17174exn = this.OLrzqt;
        ShapeableImageView shapeableImageView = c17174exn.AhwBna;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        java.lang.String strDbNXlk = c18988fsm.DbNXlk();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c17174exn.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, strDbNXlk, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        ShapeableImageView shapeableImageView2 = c17174exn.KWHzl;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        java.lang.String strAEQbTJ = c18988fsm.AEQbTJ();
        int i3 = C52761wXj.TaskDescription.aHXSQp;
        int i4 = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c17174exn.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView2, strAEQbTJ, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context2), false, 32, null);
        c17174exn.DbNXlk.setText(c18988fsm.isConnected());
        java.lang.String strCopydefault = c18988fsm.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "--")) {
            iTradeFallDefault$default = ContextCompat.getColor(AEQbTJ(), C52761wXj.Activity.QwvEab);
        } else if (C33129mqd.AEQbTJ(strCopydefault, 0)) {
            iTradeFallDefault$default = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, AEQbTJ(), 0.0f, 2, null);
        } else {
            iTradeFallDefault$default = C33129mqd.gEmmrt(strCopydefault, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, AEQbTJ(), 0.0f, 2, null) : ContextCompat.getColor(AEQbTJ(), C52761wXj.Activity.fdOvFl);
        }
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.copydefault(strCopydefault), RoundingMode.DOWN, null, DisplaySign.EXCEPT_ZERO, null, null, 26, null);
        c17174exn.fetchVPNInfo.setTextColor(iTradeFallDefault$default);
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "--")) {
            c17174exn.fetchVPNInfo.setText("--");
        } else {
            c17174exn.fetchVPNInfo.setText(iCUPercent$default);
        }
        C10854bwM c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(c18988fsm.fetchVPNInfo(), c18988fsm.OLrzqt());
        c17174exn.isConnected.setText(C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(c18988fsm.AhwBna()), null, c10854bwMEZpvd != null ? c10854bwMEZpvd.getNewProxyInstance() : false, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 21, null));
        EZpvd(c18988fsm, this.KWHzl);
        c17174exn.AkhnZx.setText(c18988fsm.AkhnZx());
        android.widget.TextView textView = c17174exn.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c18988fsm.ejfBZ() ? 0 : 8);
        android.view.View view = c17174exn.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(c18988fsm.ejfBZ() ? 0 : 8);
        c17174exn.djBIcL.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, c18988fsm.fetchVPNInfo(), false, 2, null));
        ConstraintLayout root = c17174exn.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, c18988fsm));
    }

    public final void EZpvd(C18988fsm c18988fsm, final Function1<? super TagEventProperty, Unit> function1) {
        C17174exn c17174exn = this.OLrzqt;
        java.util.List<TagWrapper> listComponent2 = C18956fsG.EZpvd(c18988fsm.valueOf()).component2();
        C19258fxr c19258fxr = c17174exn.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c19258fxr, "");
        C18956fsG.OLrzqt(c19258fxr, AEQbTJ(), listComponent2, new Function1() { // from class: o.fwD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19163fwB.copydefault(function1, (TagEventProperty) obj);
            }
        });
        android.content.Context contextAEQbTJ = AEQbTJ();
        java.util.List<TagWrapper> listValueOf = c18988fsm.valueOf();
        java.lang.Integer numDjBIcL = c18988fsm.djBIcL();
        C19258fxr c19258fxr2 = c17174exn.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c19258fxr2, "");
        final java.util.List<C18985fsj> listKWHzl = C18956fsG.KWHzl(contextAEQbTJ, listValueOf, numDjBIcL, c19258fxr2.getVisibility() == 0);
        c17174exn.valueOf.setTags(listKWHzl, new Function0() { // from class: o.fwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19163fwB.copydefault(this.OLrzqt, listKWHzl);
            }
        });
    }

    public static final Unit copydefault(Function1 function1, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(tagEventProperty, "");
        function1.invoke(tagEventProperty);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C19163fwB c19163fwB, java.util.List list) {
        c19163fwB.EZpvd.invoke(C18986fsk.copydefault(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fwB$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C19163fwB AEQbTJ;
        public final /* synthetic */ C18988fsm KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19163fwB c19163fwB, C18988fsm c18988fsm) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c19163fwB;
            this.KWHzl = c18988fsm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.copydefault.invoke(this.KWHzl);
            }
        }
    }
}
