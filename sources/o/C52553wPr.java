package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52553wPr extends AbstractC59533zio<C55801xqm, ActionBar> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final android.content.Context EZpvd;
    public final yHT<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52553wPr(@NotNull android.content.Context context, yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, Unit> yht) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
        this.copydefault = yht;
    }

    /* JADX INFO: renamed from: o.wPr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wPr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.gBtXYZ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        ActionBar actionBar = new ActionBar((AbstractC48493uTl) viewDataBindingInflate);
        actionBar.KWHzl().AEQbTJ.sSMYrx();
        actionBar.KWHzl().EZpvd.sSMYrx();
        return actionBar;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull C55801xqm c55801xqm) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(c55801xqm, "");
        AEQbTJ(actionBar, c55801xqm);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull C55801xqm c55801xqm, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(c55801xqm, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            AEQbTJ(actionBar, c55801xqm);
        } else if (list.contains("price_update")) {
            actionBar.KWHzl().AYXKKw.setText(C56033xvF.getBotPrice$default("SPOT", c55801xqm.KWHzl(), c55801xqm.copydefault(), false, false, null, null, 120, null));
        }
    }

    public final void AEQbTJ(final ActionBar actionBar, final C55801xqm c55801xqm) {
        java.lang.String instFamily;
        final AbstractC48493uTl abstractC48493uTlKWHzl = actionBar.KWHzl();
        Glide.KWHzl(abstractC48493uTlKWHzl.OLrzqt).EZpvd(c55801xqm.AEQbTJ()).EZpvd(abstractC48493uTlKWHzl.OLrzqt);
        abstractC48493uTlKWHzl.copydefault.setText(c55801xqm.OLrzqt());
        abstractC48493uTlKWHzl.AYXKKw.setText(C56033xvF.getBotPrice$default("SPOT", c55801xqm.KWHzl(), c55801xqm.copydefault(), false, false, null, null, 120, null));
        java.lang.String strFIwbmz = null;
        int iAhwBna = 2;
        C47988uAv.setInputLabel$default(abstractC48493uTlKWHzl.EZpvd, C33070mpX.AYXKKw(C48033uCm.Fragment.DMb), null, 2, null);
        C47988uAv.setInputLabel$default(abstractC48493uTlKWHzl.AEQbTJ, C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKDCKfqPDCfLja), null, 2, null);
        abstractC48493uTlKWHzl.AEQbTJ.setFloatingHint(C33070mpX.AYXKKw(C48033uCm.Fragment.DMb));
        abstractC48493uTlKWHzl.AEQbTJ.setFloatingHint(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKDCKfqPDCfLja));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(c55801xqm.KWHzl()) : null;
        if (abstractC54531xLwOLrzqt != null) {
            if (bizInstrumentValueOf == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) {
                instFamily = "";
            }
            strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(instFamily);
        }
        if (strFIwbmz != null && strFIwbmz.length() != 0) {
            iAhwBna = C33129mqd.AhwBna(strFIwbmz);
        }
        abstractC48493uTlKWHzl.EZpvd.setMaxDecimal(iAhwBna);
        abstractC48493uTlKWHzl.AEQbTJ.setMaxDecimal(iAhwBna);
        java.lang.String strAkhnZx = abstractC48493uTlKWHzl.EZpvd.AkhnZx();
        java.lang.String strAkhnZx2 = abstractC48493uTlKWHzl.AEQbTJ.AkhnZx();
        if (!Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) c55801xqm.AYXKKw())) {
            C47988uAv.setInputContent$default(abstractC48493uTlKWHzl.EZpvd, c55801xqm.AYXKKw(), false, false, 6, null);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) strAkhnZx2, (java.lang.Object) c55801xqm.valueOf())) {
            C47988uAv.setInputContent$default(abstractC48493uTlKWHzl.AEQbTJ, c55801xqm.valueOf(), false, false, 6, null);
        }
        abstractC48493uTlKWHzl.EZpvd.setOnTextChangeCallback(new Function2() { // from class: o.wPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52553wPr.OLrzqt(abstractC48493uTlKWHzl, this, actionBar, c55801xqm, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        abstractC48493uTlKWHzl.AEQbTJ.setOnTextChangeCallback(new Function2() { // from class: o.wPw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52553wPr.copydefault(abstractC48493uTlKWHzl, this, actionBar, c55801xqm, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        EZpvd(actionBar, c55801xqm.AYXKKw(), c55801xqm.valueOf());
    }

    public static final Unit OLrzqt(AbstractC48493uTl abstractC48493uTl, C52553wPr c52553wPr, ActionBar actionBar, C55801xqm c55801xqm, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        java.lang.String strAkhnZx = abstractC48493uTl.EZpvd.AkhnZx();
        java.lang.String strAkhnZx2 = abstractC48493uTl.AEQbTJ.AkhnZx();
        boolean zEZpvd = c52553wPr.EZpvd(actionBar, strAkhnZx, strAkhnZx2);
        yHT<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, Unit> yht = c52553wPr.copydefault;
        if (yht != null) {
            yht.invoke(c55801xqm.KWHzl(), strAkhnZx, strAkhnZx2, java.lang.Boolean.valueOf(zEZpvd));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC48493uTl abstractC48493uTl, C52553wPr c52553wPr, ActionBar actionBar, C55801xqm c55801xqm, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        java.lang.String strAkhnZx = abstractC48493uTl.EZpvd.AkhnZx();
        java.lang.String strAkhnZx2 = abstractC48493uTl.AEQbTJ.AkhnZx();
        boolean zEZpvd = c52553wPr.EZpvd(actionBar, strAkhnZx, strAkhnZx2);
        yHT<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, Unit> yht = c52553wPr.copydefault;
        if (yht != null) {
            yht.invoke(c55801xqm.KWHzl(), strAkhnZx, strAkhnZx2, java.lang.Boolean.valueOf(zEZpvd));
        }
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(ActionBar actionBar, java.lang.String str, java.lang.String str2) {
        AbstractC48493uTl abstractC48493uTlKWHzl = actionBar.KWHzl();
        boolean z = str.length() > 0 && str2.length() > 0 && C33129mqd.AEQbTJ(str, str2);
        if (z) {
            C47988uAv.setInputErrorMsg$default(abstractC48493uTlKWHzl.EZpvd, null, 1, null);
            C47988uAv.setInputErrorMsg$default(abstractC48493uTlKWHzl.AEQbTJ, null, 1, null);
            android.widget.TextView textView = abstractC48493uTlKWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        } else {
            abstractC48493uTlKWHzl.EZpvd.copydefault();
            abstractC48493uTlKWHzl.AEQbTJ.copydefault();
            android.widget.TextView textView2 = abstractC48493uTlKWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        return z;
    }

    /* JADX INFO: renamed from: o.wPr$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC48493uTl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48493uTl KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC48493uTl abstractC48493uTl) {
            super(abstractC48493uTl.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48493uTl, "");
            this.copydefault = abstractC48493uTl;
        }
    }
}
