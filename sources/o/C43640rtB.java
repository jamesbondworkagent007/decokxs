package o;

import androidx.activity.result.ActivityResultCallback;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import com.okinc.nft.ui.mediapicker.data.constants.MediaPickerType;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43640rtB extends C57658yma {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public InterfaceC43645rtG AEQbTJ;
    public final AbstractC55115xdp KWHzl = C55119xdt.AEQbTJ.KWHzl(this, new ActivityResultCallback() { // from class: o.rtD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(java.lang.Object obj) {
            C43640rtB.copydefault(this.OLrzqt, (android.net.Uri) obj);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC43645rtG interfaceC43645rtG) {
        Intrinsics.checkNotNullParameter(interfaceC43645rtG, "");
        this.AEQbTJ = interfaceC43645rtG;
    }

    /* JADX INFO: renamed from: o.rtB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rtB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C43640rtB KWHzl(java.lang.String str) {
            C43640rtB c43640rtB = new C43640rtB();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("selectedPath", str);
            c43640rtB.setArguments(bundle);
            return c43640rtB;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl.KWHzl();
    }

    public void EZpvd() {
        dismissAllowingStateLoss();
    }

    public static final void copydefault(C43640rtB c43640rtB, android.net.Uri uri) {
        if (uri != null) {
            Objects.toString(uri);
            MediaInfo mediaInfoOLrzqt = C43648rtJ.OLrzqt(c43640rtB.requireContext(), uri, MediaPickerType.TYPE_IMAGE);
            if (mediaInfoOLrzqt != null) {
                InterfaceC43645rtG interfaceC43645rtG = c43640rtB.AEQbTJ;
                if (interfaceC43645rtG != null) {
                    java.lang.String strOLrzqt = mediaInfoOLrzqt.OLrzqt();
                    Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                    java.lang.String strEZpvd = mediaInfoOLrzqt.EZpvd();
                    Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
                    long jCopydefault = mediaInfoOLrzqt.copydefault();
                    java.lang.String strGEmmrt = mediaInfoOLrzqt.gEmmrt();
                    Intrinsics.checkNotNullExpressionValue(strGEmmrt, "");
                    interfaceC43645rtG.copydefault(1, strOLrzqt, strEZpvd, jCopydefault, strGEmmrt);
                    return;
                }
                return;
            }
            c43640rtB.EZpvd();
            return;
        }
        c43640rtB.EZpvd();
    }
}
