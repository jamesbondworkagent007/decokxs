package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C48033uCm;
import o.InterfaceC48893ueK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53686wqF extends AbstractC48902ueT<ImageCustomPreviewConfig> {
    public static C53780wru OLrzqt;
    public C48339uNv AhwBna;
    public kotlin.Pair<? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList> AuCTel;
    public C53702wqV EZpvd;
    public C53702wqV fetchVPNInfo;
    public ViewTreeObserver.OnGlobalLayoutListener isConnected;
    public C53771wrl valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static TacticsData AEQbTJ = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
    public static java.util.List<StrategyProfitResponse> copydefault = yDY.AhwBna();
    public final int values = C48033uCm.Activity.gasjUx;
    public boolean gEmmrt = true;
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.wqK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C53686wqF.OLrzqt(this.AEQbTJ));
        }
    });
    public boolean AkhnZx = true;
    public boolean AYXKKw = true;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wqH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53686wqF.copydefault(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.values;
    }

    /* JADX INFO: renamed from: o.wqF$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wqF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            C53686wqF.AEQbTJ = tacticsData;
        }

        public final void AEQbTJ(@NotNull java.util.List<StrategyProfitResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C53686wqF.copydefault = list;
        }

        public final void OLrzqt(C53780wru c53780wru) {
            C53686wqF.OLrzqt = c53780wru;
        }
    }

    /* JADX INFO: renamed from: o.wqF$TaskDescription */
    public static final class TaskDescription implements View.OnLayoutChangeListener {
        public TaskDescription() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.wrl.drawChart$default(o.wrl, java.util.List, java.lang.Boolean, int, java.lang.Object):void */
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            C53771wrl c53771wrl = C53686wqF.this.valueOf;
            if (c53771wrl != null) {
                C53771wrl.drawChart$default(c53771wrl, C53686wqF.copydefault, null, 2, null);
            }
        }
    }

    public final boolean OLrzqt() {
        return ((java.lang.Boolean) this.DbNXlk.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(C53686wqF c53686wqF) {
        return c53686wqF.requireShareParams().getExtras().getBoolean("BOT_SHARE_VIP_KEY");
    }

    public final java.util.List<InterfaceC48901ueS> copydefault() {
        return (java.util.List) this.djBIcL.getValue();
    }

    public static final java.util.List copydefault(C53686wqF c53686wqF) {
        InterfaceC48901ueS[] interfaceC48901ueSArr = new InterfaceC48901ueS[3];
        C53702wqV c53702wqV = null;
        interfaceC48901ueSArr[0] = InterfaceC48893ueK.Application.createWatermarkEditMenuItem$default((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class), null, null, null, null, false, 31, null);
        C53702wqV c53702wqV2 = c53686wqF.fetchVPNInfo;
        if (c53702wqV2 == null) {
            Intrinsics.gEmmrt("");
            c53702wqV2 = null;
        }
        interfaceC48901ueSArr[1] = c53702wqV2;
        C53702wqV c53702wqV3 = c53686wqF.EZpvd;
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
        final C48339uNv c48339uNvAEQbTJ = C48339uNv.AEQbTJ(android.view.LayoutInflater.from(new C55365xia(contextRequireContext, 32)).inflate(getLayoutId(), viewGroup, false));
        this.AhwBna = c48339uNvAEQbTJ;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = -1.0f;
        final Ref.IntRef intRef = new Ref.IntRef();
        this.isConnected = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.wqJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C53686wqF.copydefault(c48339uNvAEQbTJ, floatRef, intRef, this);
            }
        };
        c48339uNvAEQbTJ.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.isConnected);
        android.widget.FrameLayout root = c48339uNvAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final void copydefault(C48339uNv c48339uNv, Ref.FloatRef floatRef, Ref.IntRef intRef, C53686wqF c53686wqF) {
        float height = c48339uNv.getRoot().getHeight();
        if (floatRef.element == height) {
            int i = intRef.element + 1;
            intRef.element = i;
            if (i >= 5) {
                c48339uNv.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(c53686wqF.isConnected);
                return;
            }
            return;
        }
        floatRef.element = height;
        intRef.element = 0;
        float fMin = java.lang.Math.min(height / C33070mpX.OLrzqt(C48033uCm.TaskDescription.EZpvd), 1.0f);
        c48339uNv.iwGUEr.setScaleX(fMin);
        c48339uNv.iwGUEr.setScaleY(fMin);
        c48339uNv.iwGUEr.setPivotX(r3.getWidth() / 2.0f);
        c48339uNv.iwGUEr.setPivotY(0.0f);
        c48339uNv.getRoot().requestLayout();
        c48339uNv.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.widget.FrameLayout root;
        android.view.ViewTreeObserver viewTreeObserver;
        C48339uNv c48339uNv = this.AhwBna;
        if (c48339uNv != null && (root = c48339uNv.getRoot()) != null && (viewTreeObserver = root.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.isConnected);
        }
        this.AhwBna = null;
        this.valueOf = null;
        super.onDestroyView();
    }

    /* JADX DEBUG: Method merged with bridge method: getPreviewContainer()Landroid/view/ViewGroup; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getPreviewContainer() {
        C48339uNv c48339uNv = this.AhwBna;
        ConstraintLayout constraintLayout = c48339uNv != null ? c48339uNv.iwGUEr : null;
        Intrinsics.copydefault(constraintLayout);
        return constraintLayout;
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.graphics.Rect getImageBounds() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C48339uNv c48339uNv = this.AhwBna;
        int width = (c48339uNv == null || (constraintLayout2 = c48339uNv.iwGUEr) == null) ? 0 : constraintLayout2.getWidth();
        C48339uNv c48339uNv2 = this.AhwBna;
        return new android.graphics.Rect(0, 0, width, (c48339uNv2 == null || (constraintLayout = c48339uNv2.iwGUEr) == null) ? 0 : constraintLayout.getHeight());
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C48339uNv c48339uNv = this.AhwBna;
        if (c48339uNv != null) {
            C53771wrl c53771wrl = new C53771wrl(AEQbTJ);
            this.gEmmrt = true;
            C53770wrk.AEQbTJ.EZpvd(c48339uNv, AEQbTJ, OLrzqt, OLrzqt(), c53771wrl);
            this.valueOf = c53771wrl;
            this.AuCTel = new kotlin.Pair<>(c48339uNv.EZpvd.getText(), c48339uNv.EZpvd.getTextColors());
            this.fetchVPNInfo = new C53702wqV("MAIN_MENU_ITEM_ID", AEQbTJ.getShareData().getMainDataTitle(), this.AkhnZx, new Function1() { // from class: o.wqL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53686wqF.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            this.EZpvd = new C53702wqV("ALT_MENU_ITEM_ID", c48339uNv.AEQbTJ.getText(), this.AYXKKw, new Function1() { // from class: o.wqI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53686wqF.AEQbTJ(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        notifyPreviewFirstLoaded();
    }

    public static final Unit EZpvd(C53686wqF c53686wqF, boolean z) {
        c53686wqF.AkhnZx = z;
        c53686wqF.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53686wqF c53686wqF, boolean z) {
        c53686wqF.AYXKKw = z;
        c53686wqF.AEQbTJ();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        android.widget.FrameLayout root;
        super.onResume();
        if (this.gEmmrt) {
            this.gEmmrt = false;
            C48339uNv c48339uNv = this.AhwBna;
            if (c48339uNv == null || (root = c48339uNv.getRoot()) == null) {
                return;
            }
            root.addOnLayoutChangeListener(new TaskDescription());
        }
    }

    @Override // o.AbstractC48902ueT, o.AbstractC48908ueZ
    public java.util.List<InterfaceC48901ueS> provideEditMenuList() {
        return copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: onRequestPendingShareParams(Lcom/okinc/share/platforms/SharePlatform;)Lcom/okinc/share/api/params/IShareParams; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ImageShareParams onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        java.lang.String absolutePath;
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        ImageShareParams imageShareParams = (ImageShareParams) super.onRequestPendingShareParams(sharePlatform);
        boolean z = sharePlatform != SharePlatform.SHARE_TO_IM;
        C48339uNv c48339uNv = this.AhwBna;
        if (c48339uNv != null) {
            copydefault(c48339uNv);
            C53770wrk c53770wrk = C53770wrk.AEQbTJ;
            ConstraintLayout constraintLayout = c48339uNv.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            C49352umt c49352umt = c48339uNv.isConnected;
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

    public final void copydefault(C48339uNv c48339uNv) {
        c48339uNv.iwGUEr.setScaleX(1.0f);
        c48339uNv.iwGUEr.setScaleY(1.0f);
    }

    public final void AEQbTJ() {
        C53702wqV c53702wqV = this.fetchVPNInfo;
        kotlin.Pair<? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList> pair = null;
        if (c53702wqV == null) {
            Intrinsics.gEmmrt("");
            c53702wqV = null;
        }
        c53702wqV.copydefault(this.AYXKKw);
        C53702wqV c53702wqV2 = this.EZpvd;
        if (c53702wqV2 == null) {
            Intrinsics.gEmmrt("");
            c53702wqV2 = null;
        }
        c53702wqV2.copydefault(this.AkhnZx);
        C48339uNv c48339uNv = this.AhwBna;
        if (c48339uNv != null) {
            if (this.AkhnZx) {
                kotlin.Pair<? extends java.lang.CharSequence, ? extends android.content.res.ColorStateList> pair2 = this.AuCTel;
                if (pair2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    pair = pair2;
                }
                java.lang.CharSequence charSequenceComponent1 = pair.component1();
                android.content.res.ColorStateList colorStateListComponent2 = pair.component2();
                c48339uNv.EZpvd.setText(charSequenceComponent1);
                c48339uNv.EZpvd.setTextColor(colorStateListComponent2);
                C53771wrl c53771wrl = this.valueOf;
                if (c53771wrl != null) {
                    c53771wrl.EZpvd(copydefault, java.lang.Boolean.FALSE);
                }
                c48339uNv.djBIcL.EZpvd(C33129mqd.copydefault((java.lang.Object) AEQbTJ.getShareData().getMainDataValue(), (java.lang.Object) 0));
            } else {
                c48339uNv.EZpvd.setText(c48339uNv.copydefault.getText());
                c48339uNv.EZpvd.setTextColor(c48339uNv.copydefault.getTextColors());
                C53771wrl c53771wrl2 = this.valueOf;
                if (c53771wrl2 != null) {
                    c53771wrl2.EZpvd(copydefault, java.lang.Boolean.TRUE);
                }
                c48339uNv.djBIcL.EZpvd(C33129mqd.copydefault((java.lang.Object) AEQbTJ.getShareData().getAltDataValue(), (java.lang.Object) 0));
            }
            boolean z = this.AkhnZx && this.AYXKKw;
            android.widget.TextView textView = c48339uNv.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z ? 0 : 8);
            android.widget.TextView textView2 = c48339uNv.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AEQbTJ = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
        copydefault = yDY.AhwBna();
        OLrzqt = null;
        super.onDestroy();
    }
}
