package com.okinc.auth.impl.passkey.ui.crossdevice.verify;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.C;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyBottomFragment;
import com.okinc.auth.impl.widget.SimpleToolBar;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC6072aIT;
import o.C33054mpH;
import o.C43454rpb;
import o.C52781wYc;
import o.C52794wYp;
import o.C55296xhK;
import o.C5634aAF;
import o.C56524yIo;
import o.C5656aAb;
import o.C58893zTh;
import o.C6690aUB;
import o.InterfaceC56387yDm;
import o.yCM;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyCrossDeviceVerifyBottomFragment extends AbstractC6072aIT {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public C5656aAb djBIcL;
    public final InterfaceC56387yDm gEmmrt;

    @yCM
    public C58893zTh passkeyTracker;

    public PasskeyCrossDeviceVerifyBottomFragment() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyCrossDeviceVerifyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyBottomFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyBottomFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyBottomFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.aIT.AEQbTJ()V */
    public final C58893zTh AEQbTJ() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PasskeyCrossDeviceVerifyViewModel valueOf() {
        return (PasskeyCrossDeviceVerifyViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyBottomFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class StateListAnimator extends ActionBar {
            public static final StateListAnimator AEQbTJ = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private ActionBar() {
        }

        public static final class Application extends ActionBar {
            public static final Application EZpvd = new Application();

            private Application() {
                super(null);
            }
        }

        public static final class TaskDescription extends ActionBar {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyBottomFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final PasskeyCrossDeviceVerifyBottomFragment EZpvd() {
            return new PasskeyCrossDeviceVerifyBottomFragment();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(0);
        setCancelable(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C5656aAb c5656aAbOLrzqt = C5656aAb.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        this.djBIcL = c5656aAbOLrzqt;
        SimpleToolBar simpleToolBar = c5656aAbOLrzqt.KWHzl;
        simpleToolBar.setNavigationIconVisible(false);
        simpleToolBar.setRightIconVisible(true);
        simpleToolBar.setRightIconOnClickListener(new Function0() { // from class: o.aJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PasskeyCrossDeviceVerifyBottomFragment.KWHzl(this.copydefault);
            }
        });
        ImageView imageView = c5656aAbOLrzqt.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        Context context = c5656aAbOLrzqt.copydefault.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/auth/common/passkey/okx_passkey_cross_device_send.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        C52794wYp c52794wYp = c5656aAbOLrzqt.copydefault.copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    public static final Unit KWHzl(PasskeyCrossDeviceVerifyBottomFragment passkeyCrossDeviceVerifyBottomFragment) {
        passkeyCrossDeviceVerifyBottomFragment.valueOf().KWHzl();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ(ActionBar.StateListAnimator.AEQbTJ);
        AhwBna();
    }

    public final void AEQbTJ(String str) throws WriterException {
        C5634aAF c5634aAF;
        ImageView imageView;
        Bitmap bitmapKWHzl = KWHzl(str, 512, 512);
        C5656aAb c5656aAb = this.djBIcL;
        if (c5656aAb == null || (c5634aAF = c5656aAb.EZpvd) == null || (imageView = c5634aAF.copydefault) == null) {
            return;
        }
        imageView.setImageBitmap(bitmapKWHzl);
    }

    private final void AhwBna() {
        C6690aUB.KWHzl(valueOf().valueOf(), this, new PasskeyCrossDeviceVerifyBottomFragment$observeViewModel$1(this, null));
        C6690aUB.KWHzl(valueOf().AYXKKw(), this, new PasskeyCrossDeviceVerifyBottomFragment$observeViewModel$2(this, null));
        C6690aUB.KWHzl(valueOf().AhwBna(), this, new PasskeyCrossDeviceVerifyBottomFragment$observeViewModel$3(this, null));
    }

    public final void AEQbTJ(ActionBar actionBar) {
        C5656aAb c5656aAb = this.djBIcL;
        if (c5656aAb != null) {
            if (actionBar instanceof ActionBar.StateListAnimator) {
                LinearLayout root = c5656aAb.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                root.setVisibility(0);
                LinearLayout root2 = c5656aAb.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                root2.setVisibility(8);
                LinearLayout root3 = c5656aAb.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root3, "");
                root3.setVisibility(8);
                return;
            }
            if (actionBar instanceof ActionBar.Application) {
                LinearLayout root4 = c5656aAb.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root4, "");
                root4.setVisibility(8);
                LinearLayout root5 = c5656aAb.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root5, "");
                root5.setVisibility(0);
                LinearLayout root6 = c5656aAb.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root6, "");
                root6.setVisibility(8);
                return;
            }
            if (!(actionBar instanceof ActionBar.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            LinearLayout root7 = c5656aAb.EZpvd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root7, "");
            root7.setVisibility(8);
            LinearLayout root8 = c5656aAb.AEQbTJ.getRoot();
            Intrinsics.checkNotNullExpressionValue(root8, "");
            root8.setVisibility(8);
            LinearLayout root9 = c5656aAb.copydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root9, "");
            root9.setVisibility(0);
            AEQbTJ().djBIcL();
        }
    }

    public final Bitmap KWHzl(String str, int i, int i2) throws WriterException {
        HashMap map = new HashMap();
        map.put(EncodeHintType.CHARACTER_SET, C.UTF8_NAME);
        map.put(EncodeHintType.MARGIN, 1);
        BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, i, i2, map);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                bitmapCreateBitmap.setPixel(i3, i4, bitMatrixEncode.get(i3, i4) ? ViewCompat.MEASURED_STATE_MASK : -1);
            }
        }
        return bitmapCreateBitmap;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ PasskeyCrossDeviceVerifyBottomFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, PasskeyCrossDeviceVerifyBottomFragment passkeyCrossDeviceVerifyBottomFragment) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = passkeyCrossDeviceVerifyBottomFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AEQbTJ().gEmmrt();
                this.copydefault.valueOf().EZpvd();
            }
        }
    }
}
