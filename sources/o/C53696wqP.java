package o;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.tradeuilib.imgs.OKRemoteImageResource;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C48033uCm;
import o.InterfaceC48893ueK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53696wqP extends AbstractC48902ueT<ImageCustomPreviewConfig> {
    public static C53780wru AEQbTJ;
    public Triple<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList> AkhnZx;
    public Triple<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList> DbNXlk;
    public C48340uNw EZpvd;
    public C53702wqV OLrzqt;
    public C53702wqV isConnected;
    public ViewTreeObserver.OnGlobalLayoutListener values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static TacticsData KWHzl = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
    public final int djBIcL = C48033uCm.Activity.fvQaOB;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wqM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C53696wqP.copydefault(this.EZpvd));
        }
    });
    public boolean AhwBna = true;
    public boolean AYXKKw = true;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wqN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53696wqP.KWHzl(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.wqP$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wqP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(@NotNull TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            C53696wqP.KWHzl = tacticsData;
        }

        public final void OLrzqt(C53780wru c53780wru) {
            C53696wqP.AEQbTJ = c53780wru;
        }
    }

    private final boolean copydefault() {
        return ((java.lang.Boolean) this.gEmmrt.getValue()).booleanValue();
    }

    public static final boolean copydefault(C53696wqP c53696wqP) {
        return c53696wqP.requireShareParams().getExtras().getBoolean("BOT_SHARE_VIP_KEY");
    }

    private final java.util.List<InterfaceC48901ueS> OLrzqt() {
        return (java.util.List) this.valueOf.getValue();
    }

    public static final java.util.List KWHzl(C53696wqP c53696wqP) {
        InterfaceC48901ueS[] interfaceC48901ueSArr = new InterfaceC48901ueS[3];
        C53702wqV c53702wqV = null;
        interfaceC48901ueSArr[0] = InterfaceC48893ueK.Application.createWatermarkEditMenuItem$default((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class), null, null, null, null, false, 31, null);
        C53702wqV c53702wqV2 = c53696wqP.isConnected;
        if (c53702wqV2 == null) {
            Intrinsics.gEmmrt("");
            c53702wqV2 = null;
        }
        interfaceC48901ueSArr[1] = c53702wqV2;
        C53702wqV c53702wqV3 = c53696wqP.OLrzqt;
        if (c53702wqV3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c53702wqV = c53702wqV3;
        }
        interfaceC48901ueSArr[2] = c53702wqV;
        return yDY.gEmmrt(interfaceC48901ueSArr);
    }

    @Override // o.AbstractC48908ueZ, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C48340uNw c48340uNwCopydefault = C48340uNw.copydefault(android.view.LayoutInflater.from(new C55365xia(contextRequireContext, 32)).inflate(getLayoutId(), viewGroup, false));
        this.EZpvd = c48340uNwCopydefault;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = -1.0f;
        final Ref.IntRef intRef = new Ref.IntRef();
        this.values = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.wqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C53696wqP.EZpvd(c48340uNwCopydefault, floatRef, intRef, this);
            }
        };
        c48340uNwCopydefault.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.values);
        android.widget.FrameLayout root = c48340uNwCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final void EZpvd(C48340uNw c48340uNw, Ref.FloatRef floatRef, Ref.IntRef intRef, C53696wqP c53696wqP) {
        float height = c48340uNw.getRoot().getHeight();
        if (floatRef.element == height) {
            int i = intRef.element + 1;
            intRef.element = i;
            if (i >= 5) {
                c48340uNw.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(c53696wqP.values);
                return;
            }
            return;
        }
        floatRef.element = height;
        intRef.element = 0;
        float fMin = java.lang.Math.min(height / C33070mpX.OLrzqt(C48033uCm.TaskDescription.EZpvd), 1.0f);
        c48340uNw.uzCIH.setScaleX(fMin);
        c48340uNw.uzCIH.setScaleY(fMin);
        c48340uNw.uzCIH.setPivotX(r3.getWidth() / 2.0f);
        c48340uNw.uzCIH.setPivotY(0.0f);
        c48340uNw.getRoot().requestLayout();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.widget.FrameLayout root;
        android.view.ViewTreeObserver viewTreeObserver;
        C48340uNw c48340uNw = this.EZpvd;
        if (c48340uNw != null && (root = c48340uNw.getRoot()) != null && (viewTreeObserver = root.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.values);
        }
        this.EZpvd = null;
        super.onDestroyView();
    }

    /* JADX DEBUG: Method merged with bridge method: getPreviewContainer()Landroid/view/ViewGroup; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getPreviewContainer() {
        C48340uNw c48340uNw = this.EZpvd;
        ConstraintLayout constraintLayout = c48340uNw != null ? c48340uNw.uzCIH : null;
        Intrinsics.copydefault(constraintLayout);
        return constraintLayout;
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.graphics.Rect getImageBounds() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C48340uNw c48340uNw = this.EZpvd;
        int width = (c48340uNw == null || (constraintLayout2 = c48340uNw.uzCIH) == null) ? 0 : constraintLayout2.getWidth();
        C48340uNw c48340uNw2 = this.EZpvd;
        return new android.graphics.Rect(0, 0, width, (c48340uNw2 == null || (constraintLayout = c48340uNw2.uzCIH) == null) ? 0 : constraintLayout.getHeight());
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C48340uNw c48340uNw = this.EZpvd;
        if (c48340uNw != null) {
            C53770wrk.AEQbTJ.OLrzqt(c48340uNw, KWHzl, AEQbTJ, copydefault());
            this.AkhnZx = new Triple<>(c48340uNw.copydefault.getText(), c48340uNw.KWHzl.getText(), c48340uNw.KWHzl.getTextColors());
            kotlin.Pair<android.widget.TextView, android.widget.TextView> pairKWHzl = KWHzl(c48340uNw);
            android.widget.TextView textViewComponent1 = pairKWHzl.component1();
            android.widget.TextView textViewComponent2 = pairKWHzl.component2();
            this.DbNXlk = new Triple<>(textViewComponent1.getText(), textViewComponent2.getText(), textViewComponent2.getTextColors());
            this.isConnected = new C53702wqV("MAIN_MENU_ITEM_ID", c48340uNw.copydefault.getText(), this.AhwBna, new Function1() { // from class: o.wqT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53696wqP.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            this.OLrzqt = new C53702wqV("ALT_MENU_ITEM_ID", textViewComponent1.getText(), this.AYXKKw, new Function1() { // from class: o.wqU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53696wqP.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        notifyPreviewFirstLoaded();
    }

    public static final Unit OLrzqt(C53696wqP c53696wqP, boolean z) {
        c53696wqP.AhwBna = z;
        c53696wqP.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53696wqP c53696wqP, boolean z) {
        c53696wqP.AYXKKw = z;
        c53696wqP.AEQbTJ();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC48902ueT, o.AbstractC48908ueZ
    public java.util.List<InterfaceC48901ueS> provideEditMenuList() {
        return OLrzqt();
    }

    /* JADX DEBUG: Method merged with bridge method: onRequestPendingShareParams(Lcom/okinc/share/platforms/SharePlatform;)Lcom/okinc/share/api/params/IShareParams; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ImageShareParams onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        java.lang.String absolutePath;
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        ImageShareParams imageShareParams = (ImageShareParams) super.onRequestPendingShareParams(sharePlatform);
        boolean z = sharePlatform != SharePlatform.SHARE_TO_IM;
        C48340uNw c48340uNw = this.EZpvd;
        if (c48340uNw != null) {
            EZpvd(c48340uNw);
            C53770wrk c53770wrk = C53770wrk.AEQbTJ;
            ConstraintLayout constraintLayout = c48340uNw.uzCIH;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            C49352umt c49352umt = c48340uNw.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c49352umt, "");
            java.io.File fileSavePendingShareBitmapFile = savePendingShareBitmapFile(c53770wrk.copydefault(constraintLayout, c49352umt, z));
            if (fileSavePendingShareBitmapFile != null && (absolutePath = fileSavePendingShareBitmapFile.getAbsolutePath()) != null) {
                imageShareParams.setPendingShareImagePath(absolutePath);
                IMMessageShareModel iMMessageShareModel = (IMMessageShareModel) imageShareParams.getExtras().getParcelable("imMessageShare");
                if (iMMessageShareModel != null) {
                    imageShareParams.getExtras().putParcelable("imMessageShare", iMMessageShareModel.copy((1783 & 1) != 0 ? iMMessageShareModel.title : null, (1783 & 2) != 0 ? iMMessageShareModel.content : null, (1783 & 4) != 0 ? iMMessageShareModel.messagePreview : null, (1783 & 8) != 0 ? iMMessageShareModel.image : absolutePath, (1783 & 16) != 0 ? iMMessageShareModel.imageBase64 : null, (1783 & 32) != 0 ? iMMessageShareModel.deeplink : null, (1783 & 64) != 0 ? iMMessageShareModel.shortLink : null, (1783 & 128) != 0 ? iMMessageShareModel.tagline : null, (1783 & 256) != 0 ? iMMessageShareModel.ctaType : null, (1783 & 512) != 0 ? iMMessageShareModel.extra : null, (1783 & 1024) != 0 ? iMMessageShareModel.bizName : null));
                }
            }
        }
        return imageShareParams;
    }

    public final void EZpvd(C48340uNw c48340uNw) {
        c48340uNw.uzCIH.setScaleX(1.0f);
        c48340uNw.uzCIH.setScaleY(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[PHI: r3
  0x0035: PHI (r3v4 kotlin.Triple<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList>) = 
  (r3v3 kotlin.Triple<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList>)
  (r3v10 kotlin.Triple<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList>)
 binds: [B:16:0x002f, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AEQbTJ() {
        Triple<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList> triple;
        C53702wqV c53702wqV = this.isConnected;
        Triple<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList> triple2 = null;
        if (c53702wqV == null) {
            Intrinsics.gEmmrt("");
            c53702wqV = null;
        }
        c53702wqV.copydefault(this.AYXKKw);
        C53702wqV c53702wqV2 = this.OLrzqt;
        if (c53702wqV2 == null) {
            Intrinsics.gEmmrt("");
            c53702wqV2 = null;
        }
        c53702wqV2.copydefault(this.AhwBna);
        final C48340uNw c48340uNw = this.EZpvd;
        if (c48340uNw != null) {
            if (this.AhwBna) {
                triple = this.AkhnZx;
                if (triple == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    triple2 = triple;
                }
            } else {
                triple = this.DbNXlk;
                if (triple == null) {
                    Intrinsics.gEmmrt("");
                }
            }
            java.lang.CharSequence charSequenceComponent1 = triple2.component1();
            java.lang.CharSequence charSequenceComponent2 = triple2.component2();
            android.content.res.ColorStateList colorStateListComponent3 = triple2.component3();
            kotlin.Pair<android.widget.TextView, android.widget.TextView> pairOLrzqt = OLrzqt(c48340uNw);
            android.widget.TextView textViewComponent1 = pairOLrzqt.component1();
            android.widget.TextView textViewComponent2 = pairOLrzqt.component2();
            textViewComponent1.setText(charSequenceComponent1);
            textViewComponent2.setText(charSequenceComponent2);
            textViewComponent2.setTextColor(colorStateListComponent3);
            ShareData shareData = KWHzl.getShareData();
            C53770wrk c53770wrk = C53770wrk.AEQbTJ;
            OKRemoteImageResource.Resource resourceKWHzl = c53770wrk.KWHzl(this.AhwBna ? shareData.getMainDataValue() : shareData.getAltDataValue(), copydefault());
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c53770wrk.OLrzqt(contextRequireContext, resourceKWHzl, new Function1() { // from class: o.wqO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53696wqP.EZpvd(c48340uNw, (android.graphics.drawable.Drawable) obj);
                }
            });
            boolean z = this.AhwBna && this.AYXKKw;
            kotlin.Pair<android.widget.TextView, android.widget.TextView> pairKWHzl = KWHzl(c48340uNw);
            android.widget.TextView textViewComponent12 = pairKWHzl.component1();
            android.widget.TextView textViewComponent22 = pairKWHzl.component2();
            textViewComponent12.setVisibility(z ? 0 : 8);
            textViewComponent22.setVisibility(z ? 0 : 8);
        }
    }

    public static final Unit EZpvd(C48340uNw c48340uNw, android.graphics.drawable.Drawable drawable) {
        c48340uNw.AuCTel.setImageDrawable(drawable);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        KWHzl = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
        AEQbTJ = null;
        super.onDestroy();
    }

    public final kotlin.Pair<android.widget.TextView, android.widget.TextView> OLrzqt(C48340uNw c48340uNw) {
        android.widget.TextView textView = c48340uNw.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return C56390yDp.OLrzqt(textView, c48340uNw.KWHzl);
    }

    public final kotlin.Pair<android.widget.TextView, android.widget.TextView> KWHzl(C48340uNw c48340uNw) {
        if (Intrinsics.EZpvd((java.lang.Object) KWHzl.getOrderType(), (java.lang.Object) "ai_bot")) {
            android.widget.TextView textView = c48340uNw.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            return C56390yDp.OLrzqt(textView, c48340uNw.AYXKKw);
        }
        android.widget.TextView textView2 = c48340uNw.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        return C56390yDp.OLrzqt(textView2, c48340uNw.OLrzqt);
    }
}
