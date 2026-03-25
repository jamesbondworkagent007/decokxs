package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.viewbinding.ViewBinding;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35707oAs<C extends OKMessageContent, PVB extends ViewDataBinding, CVB extends ViewDataBinding> extends AbstractC35702oAn<C, PVB> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int zsXlph = 8;
    public boolean wlaJM;

    public abstract int AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.wlaJM = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.wlaJM;
    }

    public abstract java.lang.Integer EZpvd();

    @Override // o.AbstractC35882oHe
    public int OLrzqt() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull C c, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return false;
    }

    public boolean bf_() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float bl_() {
        return this.wlaJM ? 0.8f : 0.74f;
    }

    public abstract android.view.ViewGroup copydefault(@NotNull oAC<PVB, CVB> oac);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object, java.util.List] */
    @Override // o.AbstractC35882oHe
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, java.util.List list) {
        copydefault(ogy, c35254nrp, (java.util.List<java.lang.Object>) list);
    }

    /* JADX INFO: renamed from: o.oAs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oAs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static /* synthetic */ int getMaxBubbleWidth$default(AbstractC35707oAs abstractC35707oAs, android.content.Context context, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMaxBubbleWidth");
        }
        if ((i2 & 2) != 0) {
            i = C55298xhM.dp2px$default(32.0f, null, 1, null);
        }
        return abstractC35707oAs.KWHzl(context, i);
    }

    public int KWHzl(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullExpressionValue(context.getResources(), "");
        return yII.EZpvd((C55302xhQ.EZpvd(r2) - i) * bl_());
    }

    public void copydefault(@NotNull final oAC<PVB, CVB> oac, @NotNull final C35254nrp c35254nrp, @NotNull final C c) {
        oGS ogs;
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        boolean fieldNames = getFieldNames();
        ViewDataBinding viewDataBindingEZpvd = oac.EZpvd();
        java.lang.Integer numEZpvd = EZpvd();
        if (numEZpvd != null) {
            viewDataBindingEZpvd.setVariable(numEZpvd.intValue(), c35254nrp.OLrzqt().getContent());
        }
        viewDataBindingEZpvd.getRoot().setOnClickListener(fieldNames ? new View.OnClickListener() { // from class: o.oAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC35707oAs.EZpvd(this.AEQbTJ, oac, c35254nrp, c, view);
            }
        } : null);
        android.view.View root = viewDataBindingEZpvd.getRoot();
        if (fieldNames) {
            android.view.View root2 = viewDataBindingEZpvd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            ogs = new oGS(root2, copydefault(oac), 0, 4, null);
        } else {
            ogs = null;
        }
        root.setOnTouchListener(ogs);
        if (fieldNames) {
            android.view.View view = oac.itemView;
            view.setOnClickListener(new Activity(view, 1000L, c35254nrp));
            AEQbTJ(oac, c35254nrp, c);
        } else {
            oac.AEQbTJ().getRoot().setOnLongClickListener(null);
            oac.itemView.getRootView().setOnLongClickListener(null);
            oac.EZpvd().getRoot().setOnLongClickListener(null);
        }
    }

    public static final void EZpvd(AbstractC35707oAs abstractC35707oAs, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent, android.view.View view) {
        Intrinsics.copydefault(view);
        abstractC35707oAs.copydefault(view, oac.getAdapterPosition(), c35254nrp, oKMessageContent);
    }

    public final void AEQbTJ(oAC<PVB, CVB> oac) {
        if (!iwGUEr() || getFieldNames()) {
            return;
        }
        android.view.View root = oac.EZpvd().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        EZpvd(root);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[PHI: r2
  0x0018: PHI (r2v3 float) = (r2v0 float), (r2v1 float) binds: [B:7:0x0016, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float zLjUOn() {
        java.lang.Float fAEQbTJ = sEI.KWHzl.AEQbTJ();
        float fFloatValue = fAEQbTJ != null ? fAEQbTJ.floatValue() : 0.8f;
        float f = 0.6f;
        if (fFloatValue <= 0.6f) {
            fFloatValue = f;
        } else {
            f = 1.0f;
            if (fFloatValue >= 1.0f) {
            }
        }
        return iwGUEr() ? java.lang.Math.min(fFloatValue, 0.8f) : fFloatValue;
    }

    public final void EZpvd(android.view.View view) {
        view.setClickable(false);
        view.setLongClickable(false);
        view.setOnClickListener(null);
        view.setOnLongClickListener(null);
        view.setOnTouchListener(null);
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                EZpvd(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: o.oAs$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C35254nrp AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C35254nrp c35254nrp) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c35254nrp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                RxBus.AEQbTJ(new C35242nrd(java.lang.Long.valueOf(this.AEQbTJ.OLrzqt().getSeq())));
            }
        }
    }

    public final void AEQbTJ(final oAC<PVB, CVB> oac, final C35254nrp c35254nrp, final C c) {
        oac.AEQbTJ().getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return AbstractC35707oAs.AhwBna(this.EZpvd, oac, c35254nrp, c, view);
            }
        });
        oac.itemView.getRootView().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return AbstractC35707oAs.AYXKKw(this.EZpvd, oac, c35254nrp, c, view);
            }
        });
        oac.EZpvd().getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return AbstractC35707oAs.djBIcL(this.copydefault, oac, c35254nrp, c, view);
            }
        });
    }

    public static final boolean AhwBna(AbstractC35707oAs abstractC35707oAs, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent, android.view.View view) {
        Intrinsics.copydefault(view);
        return abstractC35707oAs.OLrzqt(view, oac, c35254nrp, oKMessageContent);
    }

    public static final boolean AYXKKw(AbstractC35707oAs abstractC35707oAs, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent, android.view.View view) {
        Intrinsics.copydefault(view);
        return abstractC35707oAs.OLrzqt(view, oac, c35254nrp, oKMessageContent);
    }

    public static final boolean djBIcL(AbstractC35707oAs abstractC35707oAs, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent, android.view.View view) {
        Intrinsics.copydefault(view);
        return abstractC35707oAs.OLrzqt(view, oac, c35254nrp, oKMessageContent);
    }

    public final boolean OLrzqt(android.view.View view, oAC<PVB, CVB> oac, C35254nrp c35254nrp, C c) {
        return OLrzqt(view, oac.getAdapterPosition(), c35254nrp, c, oac.AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo/oGY; */
    @Override // o.AbstractC35882oHe
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public final oAC<PVB, CVB> AhwBna(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        int iCopydefault = copydefault();
        if (!copydefault(copydefault())) {
            viewGroup = null;
        }
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, iCopydefault, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        android.view.View root = viewDataBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        oAC<PVB, CVB> oac = new oAC<>(root);
        oac.OLrzqt(viewDataBindingInflate);
        oac.AEQbTJ(OLrzqt(layoutInflater, copydefault(oac)));
        oac.EZpvd(viewDataBindingInflate);
        return oac;
    }

    public CVB OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        CVB cvb = (CVB) DataBindingUtil.inflate(layoutInflater, AEQbTJ(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(cvb, "");
        viewGroup.addView(cvb.getRoot());
        return cvb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.oGY<PVB extends androidx.databinding.ViewDataBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    public void copydefault(@NotNull oGY<PVB> ogy, @NotNull C35254nrp c35254nrp, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(ogy, c35254nrp, list);
        if (list.contains("PAYLOAD_REACTION_UPDATE")) {
            OKMessageContent content = c35254nrp.OLrzqt().getContent();
            Intrinsics.copydefault(content, "");
            oAC<PVB, CVB> oac = (oAC) ogy;
            if (getFieldNames()) {
                AEQbTJ(oac, c35254nrp, content);
            } else {
                oac.AEQbTJ().getRoot().setOnLongClickListener(null);
                oac.itemView.getRootView().setOnLongClickListener(null);
                oac.EZpvd().getRoot().setOnLongClickListener(null);
            }
            AEQbTJ((oAC) oac);
            return;
        }
        OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
        OKMessageContent content2 = oKMessageOLrzqt.getContent();
        Intrinsics.copydefault(content2, "");
        oAC<PVB, CVB> oac2 = (oAC) ogy;
        copydefault(oac2, c35254nrp, content2);
        int iEZpvd = EZpvd(content2, oKMessageOLrzqt);
        if (ogy.itemView.getVisibility() != iEZpvd) {
            ogy.itemView.setVisibility(iEZpvd);
        }
        AEQbTJ((oAC) oac2);
    }

    public final boolean copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
        if (interfaceC35179nqT != null) {
            return interfaceC35179nqT.KWHzl(oKMessage);
        }
        return false;
    }

    public final void EZpvd(boolean z, @NotNull C35254nrp c35254nrp, @NotNull ViewStubProxy viewStubProxy, @NotNull ViewStubProxy viewStubProxy2) {
        Function0<com.okinc.okimcore.model.remote.UserInfo> function0HDKMBd;
        Function0<OKConversation> function0FetchVPNInfo;
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(viewStubProxy, "");
        Intrinsics.checkNotNullParameter(viewStubProxy2, "");
        if (AuCTelauCTel()) {
            return;
        }
        if (C33129mqd.KWHzl((java.util.Collection) c35254nrp.OLrzqt().getReactionDisplay())) {
            sDK sdk = (sDK) C33131mqf.OLrzqt(viewStubProxy);
            C33131mqf.KWHzl(viewStubProxy);
            C35713oAy c35713oAy = C35713oAy.KWHzl;
            C35884oHg c35884oHg = sdk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35884oHg, "");
            java.util.List<ReactionDisplay> reactionDisplay = c35254nrp.OLrzqt().getReactionDisplay();
            Intrinsics.copydefault(reactionDisplay);
            c35713oAy.EZpvd(c35884oHg, reactionDisplay, z, c35254nrp.OLrzqt().getTargetId(), c35254nrp.OLrzqt().getSeq(), c35254nrp.OLrzqt().getConversationType(), (!C35712oAx.KWHzl(c35254nrp.OLrzqt().getConversationType()) || (function0FetchVPNInfo = fetchVPNInfo()) == null) ? null : function0FetchVPNInfo.invoke(), (!C35712oAx.KWHzl(c35254nrp.OLrzqt().getConversationType()) || (function0HDKMBd = hDKMBd()) == null) ? null : function0HDKMBd.invoke(), bg_(), getFieldNames());
            if (bf_()) {
                C35884oHg c35884oHg2 = sdk.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c35884oHg2, "");
                c35713oAy.EZpvd(c35884oHg2);
                return;
            } else {
                C35884oHg c35884oHg3 = sdk.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c35884oHg3, "");
                c35713oAy.AEQbTJ(c35884oHg3);
                return;
            }
        }
        C33131mqf.EZpvd(viewStubProxy);
        C33131mqf.EZpvd(viewStubProxy2);
    }

    public final boolean AuCTelauCTel() {
        return Intrinsics.EZpvd(KWHzl(), OKReferenceMessage.class);
    }

    public boolean bg_() {
        return C33492mxV.OLrzqt();
    }
}
