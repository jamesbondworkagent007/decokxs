package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.DataBindingUtil;
import com.google.mlkit.common.MlKitException;
import com.okinc.business.defi.biz.core.error.OKWException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14522dmz extends C32995moB {
    private static int AhwBna = 1;
    private static int valueOf;
    public androidx.core.os.CancellationSignal AEQbTJ;
    public boolean AYXKKw;
    public int EZpvd;
    public long KWHzl;
    public AbstractC16528eld OLrzqt;
    public TaskDescription copydefault;

    /* JADX INFO: renamed from: o.dmz$TaskDescription */
    public interface TaskDescription {
        void KWHzl();

        void KWHzl(int i);

        void OLrzqt();

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        C14522dmz c14522dmz = (C14522dmz) objArr[0];
        TaskDescription taskDescription = (TaskDescription) objArr[1];
        int i = 2 % 2;
        int i2 = valueOf + 3;
        int i3 = i2 % 128;
        AhwBna = i3;
        int i4 = i2 % 2;
        c14522dmz.copydefault = taskDescription;
        int i5 = i3 + 75;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void EZpvd(C14522dmz c14522dmz, android.view.View view) {
        int i = 2 % 2;
        int i2 = valueOf + 121;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        AEQbTJ(c14522dmz, view);
        int i4 = AhwBna + 47;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object KWHzl(int i, int i2, java.lang.Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i2) | i7 | i);
        int i9 = (~(i7 | (~i))) | (~(i | i2));
        int i10 = (~(i2 | i5)) | i;
        int i11 = i + i5 + i3 + ((-407681510) * i4) + ((-298114539) * i6);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i) + 672923648 + (2103481690 * i5) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i3) + ((-328728576) * i4) + ((-2108424192) * i6) + ((-1296629760) * i12);
        int i14 = ((i * 57881544) - 1472685786) + (i5 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) + (i3 * 57881749) + (i4 * 289608994) + (i6 * 969284153) + (i12 * 813891584);
        return i13 + ((i14 * i14) * 454098944) != 1 ? EZpvd(objArr) : AEQbTJ(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void copydefault(C14522dmz c14522dmz, android.view.View view) {
        int i = 2 % 2;
        int i2 = valueOf + 19;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        KWHzl(c14522dmz, view);
        int i4 = valueOf + 1;
        AhwBna = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i = 2 % 2;
        int i2 = AhwBna + 61;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16528eld abstractC16528eld = (AbstractC16528eld) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.fXHmeK, null, false);
        this.OLrzqt = abstractC16528eld;
        Intrinsics.copydefault(abstractC16528eld);
        android.view.View root = abstractC16528eld.getRoot();
        int i4 = AhwBna + 81;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    public static final void AEQbTJ(C14522dmz c14522dmz, android.view.View view) {
        int i = 2 % 2;
        int i2 = AhwBna + 11;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            KWHzl(-1705704470, C39638pwC.OLrzqt(), new java.lang.Object[]{c14522dmz}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 1705704471, C39638pwC.OLrzqt());
            TaskDescription taskDescriptionKWHzl = c14522dmz.KWHzl();
            if (taskDescriptionKWHzl != null) {
                taskDescriptionKWHzl.copydefault();
                int i3 = AhwBna + 65;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
            }
            c14522dmz.dismissAllowingStateLoss();
            return;
        }
        KWHzl(-1705704470, C39638pwC.OLrzqt(), new java.lang.Object[]{c14522dmz}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 1705704471, C39638pwC.OLrzqt());
        c14522dmz.KWHzl();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        AbstractC16528eld abstractC16528eld = this.OLrzqt;
        if (abstractC16528eld != null) {
            int i2 = AhwBna + 95;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            android.widget.TextView textView = abstractC16528eld.copydefault;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: o.dmB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C14522dmz.EZpvd(this.OLrzqt, view2);
                    }
                });
            }
        }
        AbstractC16528eld abstractC16528eld2 = this.OLrzqt;
        if (abstractC16528eld2 != null) {
            int i4 = AhwBna + 117;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            android.widget.LinearLayout linearLayout = abstractC16528eld2.EZpvd;
            if (i5 != 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.dmF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C14522dmz.copydefault(this.OLrzqt, view2);
                    }
                });
            }
        }
        int i6 = AhwBna + 35;
        valueOf = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [54=4] */
    public static final void KWHzl(C14522dmz c14522dmz, android.view.View view) {
        int i = 2 % 2;
        AbstractC16528eld abstractC16528eld = c14522dmz.OLrzqt;
        if (abstractC16528eld != null) {
            int i2 = valueOf + 83;
            AhwBna = i2 % 128;
            int i3 = i2 % 2;
            android.widget.TextView textView = abstractC16528eld.AEQbTJ;
            if (textView != null) {
                textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPRAkuRW));
                int i4 = AhwBna + 121;
                valueOf = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        KWHzl(-1705704470, C39638pwC.OLrzqt(), new java.lang.Object[]{c14522dmz}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 1705704471, C39638pwC.OLrzqt());
        c14522dmz.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object[] objArr) {
        C14522dmz c14522dmz = (C14522dmz) objArr[0];
        int i = 2 % 2;
        int i2 = valueOf + 121;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        c14522dmz.AYXKKw = true;
        c14522dmz.EZpvd();
        int i4 = valueOf + 5;
        AhwBna = i4 % 128;
        java.lang.Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.C32995moB, androidx.fragment.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        if (!this.AYXKKw) {
            int i2 = valueOf + 17;
            AhwBna = i2 % 128;
            if (i2 % 2 == 0) {
                AEQbTJ();
                int i3 = 71 / 0;
            } else {
                AEQbTJ();
            }
        }
        if (getDialog() != null) {
            int i4 = valueOf + 77;
            AhwBna = i4 % 128;
            int i5 = i4 % 2;
            android.app.Dialog dialog = getDialog();
            Intrinsics.copydefault(dialog);
            android.view.Window window = dialog.getWindow();
            Intrinsics.copydefault(window);
            WindowManager.LayoutParams attributes = window.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "");
            C8124awn c8124awn = C8124awn.EZpvd;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ((ViewGroup.LayoutParams) attributes).width = (int) (((double) c8124awn.copydefault(contextRequireContext)) * 0.75d);
            android.app.Dialog dialog2 = getDialog();
            Intrinsics.copydefault(dialog2);
            android.view.Window window2 = dialog2.getWindow();
            Intrinsics.copydefault(window2);
            Intrinsics.copydefault(attributes, "");
            window2.setAttributes(attributes);
        }
        int i6 = AhwBna + 49;
        valueOf = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int i = 2 % 2;
        int i2 = AhwBna + 75;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        EZpvd();
        int i4 = valueOf + 37;
        AhwBna = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        int i = 2 % 2;
        java.lang.Object obj = null;
        try {
            androidx.core.os.CancellationSignal cancellationSignal = this.AEQbTJ;
            if (cancellationSignal != null) {
                int i2 = valueOf + 119;
                AhwBna = i2 % 128;
                if (i2 % 2 == 0) {
                    cancellationSignal.cancel();
                    throw null;
                }
                cancellationSignal.cancel();
            }
            this.AEQbTJ = null;
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            if (message == null) {
                int i3 = valueOf + 117;
                int i4 = i3 % 128;
                AhwBna = i4;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 115;
                valueOf = i5 % 128;
                int i6 = i5 % 2;
                message = "";
            }
            C10856bwO.copydefault("FingerprintVerifyDialog", 0, message, e);
            int i7 = valueOf + 65;
            AhwBna = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = AhwBna + 125;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        try {
            super.onDismiss(dialogInterface);
            KWHzl(-1705704470, C39638pwC.OLrzqt(), new java.lang.Object[]{this}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 1705704471, C39638pwC.OLrzqt());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            C10856bwO.EZpvd("NotificationServiceExtension", new OKWException("FingerprintVerifyDialog onDismiss exception", e));
        }
        int i4 = AhwBna + 117;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        int i = 2 % 2;
        int i2 = valueOf + 3;
        AhwBna = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                super.dismiss();
                int i3 = 96 / 0;
            } else {
                super.dismiss();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            C10856bwO.EZpvd("NotificationServiceExtension", new OKWException("FingerprintVerifyDialog dismiss exception", e));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        int i = 2 % 2;
        int i2 = AhwBna + 125;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        try {
            super.dismissAllowingStateLoss();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            C10856bwO.EZpvd("NotificationServiceExtension", new OKWException("FingerprintVerifyDialog dismissAllowingStateLoss exception", e));
        }
        int i4 = AhwBna + 121;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void AEQbTJ() {
        int i = 2 % 2;
        try {
            this.AEQbTJ = new androidx.core.os.CancellationSignal();
            FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(requireContext().getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(fingerprintManagerCompatFrom, "");
            fingerprintManagerCompatFrom.authenticate(null, 0, this.AEQbTJ, new ActionBar(new WeakReference(this)), null);
            int i2 = AhwBna + 1;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            C10856bwO.EZpvd("NotificationServiceExtension", new OKWException("FingerprintVerifyDialog request fingerprint exception", e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void gEmmrt() {
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = valueOf + 57;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        AbstractC16528eld abstractC16528eld = this.OLrzqt;
        if (abstractC16528eld != null && (linearLayout = abstractC16528eld.EZpvd) != null) {
            linearLayout.setVisibility(0);
        }
        AbstractC16528eld abstractC16528eld2 = this.OLrzqt;
        if (abstractC16528eld2 != null && (textView = abstractC16528eld2.AEQbTJ) != null) {
            int i4 = valueOf + 19;
            AhwBna = i4 % 128;
            if (i4 % 2 == 0) {
                textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QVAiDq));
                int i5 = 49 / 0;
            } else {
                textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QVAiDq));
            }
        }
        int i6 = AhwBna + 63;
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription KWHzl() {
        int i = 2 % 2;
        int i2 = valueOf;
        int i3 = i2 + 109;
        AhwBna = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        TaskDescription taskDescription = this.copydefault;
        if (taskDescription != null) {
            int i4 = i2 + 81;
            AhwBna = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 1;
            AhwBna = i6 % 128;
            int i7 = i6 % 2;
            return taskDescription;
        }
        if (!(getParentFragment() instanceof TaskDescription)) {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof TaskDescription) {
                return (TaskDescription) activity;
            }
            return null;
        }
        int i8 = AhwBna + 115;
        valueOf = i8 % 128;
        if (i8 % 2 == 0) {
            ActivityResultCaller parentFragment = getParentFragment();
            Intrinsics.copydefault(parentFragment, "");
            return (TaskDescription) parentFragment;
        }
        ActivityResultCaller parentFragment2 = getParentFragment();
        Intrinsics.copydefault(parentFragment2, "");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [192=4] */
    public final void AEQbTJ(int i, java.lang.CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = valueOf + 57;
        int i4 = i3 % 128;
        AhwBna = i4;
        java.lang.String strGEmmrt = null;
        if (i3 % 2 != 0 ? i == 7 : i == 105) {
            if (charSequence != null) {
                int i5 = i4 + 73;
                valueOf = i5 % 128;
                int i6 = i5 % 2;
                strGEmmrt = C33129mqd.gEmmrt(charSequence);
            }
            C33134mqi.AEQbTJ(strGEmmrt);
            TaskDescription taskDescriptionKWHzl = KWHzl();
            if (taskDescriptionKWHzl != null) {
                taskDescriptionKWHzl.OLrzqt();
            }
            dismissAllowingStateLoss();
            return;
        }
        if (i == 10) {
            KWHzl(-1705704470, C39638pwC.OLrzqt(), new java.lang.Object[]{this}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 1705704471, C39638pwC.OLrzqt());
            TaskDescription taskDescriptionKWHzl2 = KWHzl();
            if (taskDescriptionKWHzl2 != null) {
                taskDescriptionKWHzl2.copydefault();
            }
            dismissAllowingStateLoss();
            int i7 = AhwBna + 7;
            valueOf = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = i4 + 105;
        valueOf = i9 % 128;
        if (i9 % 2 != 0) {
            java.lang.System.currentTimeMillis();
            throw null;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.KWHzl;
        if (this.AYXKKw || jCurrentTimeMillis - j <= 500) {
            return;
        }
        this.KWHzl = java.lang.System.currentTimeMillis();
        C33134mqi.AEQbTJ(charSequence != null ? C33129mqd.gEmmrt(charSequence) : null);
        TaskDescription taskDescriptionKWHzl3 = KWHzl();
        if (taskDescriptionKWHzl3 != null) {
            int i10 = AhwBna + 97;
            valueOf = i10 % 128;
            if (i10 % 2 != 0) {
                taskDescriptionKWHzl3.OLrzqt();
                strGEmmrt.hashCode();
                throw null;
            }
            taskDescriptionKWHzl3.OLrzqt();
        }
        dismissAllowingStateLoss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        int i = 2 % 2;
        int i2 = this.EZpvd + 1;
        this.EZpvd = i2;
        if (i2 >= 2) {
            KWHzl(-1705704470, C39638pwC.OLrzqt(), new java.lang.Object[]{this}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 1705704471, C39638pwC.OLrzqt());
            TaskDescription taskDescriptionKWHzl = KWHzl();
            if (taskDescriptionKWHzl != null) {
                int i3 = valueOf + 7;
                AhwBna = i3 % 128;
                int i4 = i3 % 2;
                taskDescriptionKWHzl.KWHzl(this.EZpvd);
            }
            gEmmrt();
            int i5 = valueOf + 25;
            AhwBna = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = valueOf + 3;
        AhwBna = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 28 / 0;
        }
    }

    public final void AhwBna() {
        int i = 2 % 2;
        int i2 = AhwBna + 105;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            KWHzl();
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        TaskDescription taskDescriptionKWHzl = KWHzl();
        if (taskDescriptionKWHzl != null) {
            taskDescriptionKWHzl.KWHzl();
        }
        dismissAllowingStateLoss();
        int i3 = valueOf + 29;
        AhwBna = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: o.dmz$ActionBar */
    public static final class ActionBar extends FingerprintManagerCompat.AuthenticationCallback {
        public final WeakReference<C14522dmz> KWHzl;

        public ActionBar(@NotNull WeakReference<C14522dmz> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.KWHzl = weakReference;
        }

        @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
        public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
            C14522dmz c14522dmz = this.KWHzl.get();
            if (c14522dmz == null) {
                return;
            }
            c14522dmz.AEQbTJ(i, charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
        public void onAuthenticationFailed() {
            C14522dmz c14522dmz = this.KWHzl.get();
            if (c14522dmz == null) {
                return;
            }
            c14522dmz.OLrzqt();
        }

        @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
            C14522dmz c14522dmz = this.KWHzl.get();
            if (c14522dmz == null) {
                return;
            }
            c14522dmz.AhwBna();
        }
    }

    public final void OLrzqt(TaskDescription taskDescription) {
        KWHzl(-521175130, C39638pwC.OLrzqt(), new java.lang.Object[]{this, taskDescription}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 521175130, C39638pwC.OLrzqt());
    }

    public final void copydefault() {
        KWHzl(-1705704470, C39638pwC.OLrzqt(), new java.lang.Object[]{this}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 1705704471, C39638pwC.OLrzqt());
    }
}
