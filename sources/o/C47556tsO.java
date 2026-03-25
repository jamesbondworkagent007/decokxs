package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_content.input.GenericInputParentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.InterfaceC55124xdy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47556tsO extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public AbstractC55115xdp AEQbTJ;
    public InterfaceC55124xdy AYXKKw;
    public tNK EZpvd;
    public InterfaceC47543tsB KWHzl;
    public boolean copydefault;
    public GenericInputParentViewModel gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.DXXBbs;
    }

    /* JADX INFO: renamed from: o.tsO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tsO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C47556tsO EZpvd(int i, @NotNull GenericInputParentViewModel genericInputParentViewModel, @NotNull InterfaceC47543tsB interfaceC47543tsB) {
            Intrinsics.checkNotNullParameter(genericInputParentViewModel, "");
            Intrinsics.checkNotNullParameter(interfaceC47543tsB, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("maxImages", i);
            C47556tsO c47556tsO = new C47556tsO();
            c47556tsO.setArguments(bundle);
            c47556tsO.gEmmrt = genericInputParentViewModel;
            c47556tsO.KWHzl = interfaceC47543tsB;
            return c47556tsO;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        AbstractC55115xdp abstractC55115xdpKWHzl;
        super.onCreate(bundle);
        this.AYXKKw = InterfaceC55124xdy.Companion.EZpvd(this);
        android.os.Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("maxImages", 1) : 1;
        if (i > 1) {
            abstractC55115xdpKWHzl = C55119xdt.AEQbTJ.KWHzl(this, java.lang.Integer.valueOf(i), new ActivityResultCallback() { // from class: o.tsT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    C47556tsO.copydefault(this.copydefault, (java.util.List) obj);
                }
            });
        } else {
            abstractC55115xdpKWHzl = C55119xdt.AEQbTJ.KWHzl(this, new ActivityResultCallback() { // from class: o.tsS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    C47556tsO.EZpvd(this.AEQbTJ, (android.net.Uri) obj);
                }
            });
        }
        this.AEQbTJ = abstractC55115xdpKWHzl;
    }

    public static final void copydefault(C47556tsO c47556tsO, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            c47556tsO.AEQbTJ((java.util.List<? extends android.net.Uri>) list);
        }
    }

    public static final void EZpvd(C47556tsO c47556tsO, android.net.Uri uri) {
        if (uri != null) {
            c47556tsO.AEQbTJ(C56402yEa.EZpvd(uri));
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tNK tnkCopydefault = tNK.copydefault(view);
        tnkCopydefault.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.tsN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C47556tsO.EZpvd(this.copydefault, view2);
            }
        });
        tnkCopydefault.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.tsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C47556tsO.AEQbTJ(this.OLrzqt, view2);
            }
        });
        this.EZpvd = tnkCopydefault;
        view.post(new java.lang.Runnable() { // from class: o.tsQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47556tsO.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(C47556tsO c47556tsO, android.view.View view) {
        AbstractC55115xdp abstractC55115xdp = null;
        C32866mlf.onEvent$default("Feeds_Btm_LibraryImage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AbstractC55115xdp abstractC55115xdp2 = c47556tsO.AEQbTJ;
        if (abstractC55115xdp2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC55115xdp = abstractC55115xdp2;
        }
        abstractC55115xdp.KWHzl();
    }

    public static final void AEQbTJ(final C47556tsO c47556tsO, android.view.View view) {
        InterfaceC55124xdy interfaceC55124xdy;
        C32866mlf.onEvent$default("Feeds_Btm_CameraImage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        InterfaceC55124xdy interfaceC55124xdy2 = c47556tsO.AYXKKw;
        if (interfaceC55124xdy2 == null) {
            Intrinsics.gEmmrt("");
            interfaceC55124xdy = null;
        } else {
            interfaceC55124xdy = interfaceC55124xdy2;
        }
        android.content.Context contextRequireContext = c47556tsO.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC55124xdy.StateListAnimator.takePicture$default(interfaceC55124xdy, contextRequireContext, null, new Function1() { // from class: o.tsP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47556tsO.copydefault(this.EZpvd, (android.net.Uri) obj);
            }
        }, new Function1() { // from class: o.tsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47556tsO.EZpvd((java.lang.String[]) obj);
            }
        }, 2, null);
    }

    public static final Unit copydefault(C47556tsO c47556tsO, android.net.Uri uri) {
        if (uri != null) {
            c47556tsO.AEQbTJ(C56402yEa.EZpvd(uri));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        C55326xho.toast$default(C33070mpX.AYXKKw(C47501trL.Fragment.FHvxmb), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C47556tsO c47556tsO) {
        if (c47556tsO.copydefault) {
            return;
        }
        c47556tsO.copydefault = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47556tsO, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(java.util.List<? extends android.net.Uri> list) {
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            genericInputParentViewModel.copydefault(list);
        }
        InterfaceC47543tsB interfaceC47543tsB = this.KWHzl;
        if (interfaceC47543tsB != null) {
            interfaceC47543tsB.AEQbTJ();
        }
    }
}
