package o;

import com.okinc.ok_kyc_core.presentation.views.FilePickerType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rLK {
    public static final rLK OLrzqt = new rLK();

    private rLK() {
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, @NotNull final Function2<? super FilePickerType, ? super android.net.Uri, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function2, "");
        final ViewOnClickListenerC55121xdv viewOnClickListenerC55121xdv = new ViewOnClickListenerC55121xdv();
        viewOnClickListenerC55121xdv.OLrzqt(C43662rtX.Dialog.isConnected);
        viewOnClickListenerC55121xdv.copydefault(C43662rtX.Dialog.AhwBna);
        viewOnClickListenerC55121xdv.KWHzl(C43662rtX.Dialog.gEmmrt);
        viewOnClickListenerC55121xdv.gEmmrt(new Function1() { // from class: o.rLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLK.AEQbTJ(viewOnClickListenerC55121xdv, (android.view.View) obj);
            }
        });
        viewOnClickListenerC55121xdv.djBIcL(new Function1() { // from class: o.rLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLK.copydefault(viewOnClickListenerC55121xdv, (android.view.View) obj);
            }
        });
        viewOnClickListenerC55121xdv.AEQbTJ(new Function1() { // from class: o.rLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLK.AEQbTJ(function2, (android.net.Uri) obj);
            }
        });
        viewOnClickListenerC55121xdv.EZpvd(new Function1() { // from class: o.rLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLK.copydefault(function2, (android.net.Uri) obj);
            }
        });
        if (z) {
            viewOnClickListenerC55121xdv.KWHzl(true);
            viewOnClickListenerC55121xdv.AEQbTJ(C43662rtX.Dialog.values);
            viewOnClickListenerC55121xdv.copydefault(new java.lang.String[]{"application/pdf"});
            viewOnClickListenerC55121xdv.KWHzl(new Function1() { // from class: o.rLT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rLK.djBIcL(viewOnClickListenerC55121xdv, (android.view.View) obj);
                }
            });
            viewOnClickListenerC55121xdv.OLrzqt(new Function1() { // from class: o.rLS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rLK.AYXKKw(function2, (android.net.Uri) obj);
                }
            });
        }
        viewOnClickListenerC55121xdv.OLrzqt(fragmentManager);
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC55121xdv viewOnClickListenerC55121xdv, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC55121xdv.copydefault(new Function1() { // from class: o.rLV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLK.AEQbTJ((java.lang.String[]) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        C43693ruB.OLrzqt("KYC_Upload_Camera_Permission");
        C55326xho.toast$default(C43662rtX.Dialog.DbNXlk, C33070mpX.KWHzl(C43662rtX.Activity.OqFWZa), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ViewOnClickListenerC55121xdv viewOnClickListenerC55121xdv, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC55121xdv.copydefault(new Function1() { // from class: o.rLX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLK.EZpvd((java.lang.String[]) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        C43693ruB.OLrzqt("KYC_Upload_Photos_Permission");
        C55326xho.toast$default(C43662rtX.Dialog.AkhnZx, C33070mpX.KWHzl(C43662rtX.Activity.OqFWZa), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function2 function2, android.net.Uri uri) {
        function2.invoke(FilePickerType.IMAGE, uri);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function2 function2, android.net.Uri uri) {
        function2.invoke(FilePickerType.CAMERA, uri);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ViewOnClickListenerC55121xdv viewOnClickListenerC55121xdv, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC55121xdv.copydefault(new Function1() { // from class: o.rLW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLK.AYXKKw((java.lang.String[]) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        C55326xho.toast$default(C43662rtX.Dialog.fetchVPNInfo, C33070mpX.KWHzl(C43662rtX.Activity.OqFWZa), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(Function2 function2, android.net.Uri uri) {
        function2.invoke(FilePickerType.FILE, uri);
        return Unit.INSTANCE;
    }
}
