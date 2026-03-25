package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C60003ztf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60003ztf {
    public static final <T extends ViewModel> T EZpvd(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull ViewModelStore viewModelStore, java.lang.String str, @NotNull CreationExtras creationExtras, InterfaceC59997ztZ interfaceC59997ztZ, @NotNull C60060zuj c60060zuj, Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(viewModelStore, "");
        Intrinsics.checkNotNullParameter(creationExtras, "");
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        java.lang.Class<T> clsOLrzqt = yHE.OLrzqt(interfaceC56551yJo);
        ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStore, new C60021ztx(interfaceC56551yJo, c60060zuj, interfaceC59997ztZ, function0), creationExtras);
        java.lang.String strKWHzl = KWHzl(interfaceC59997ztZ, str, clsOLrzqt.getCanonicalName());
        if (strKWHzl != null) {
            return (T) viewModelProvider.get(strKWHzl, clsOLrzqt);
        }
        return (T) viewModelProvider.get(clsOLrzqt);
    }

    public static /* synthetic */ java.lang.String getViewModelKey$default(InterfaceC59997ztZ interfaceC59997ztZ, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return KWHzl(interfaceC59997ztZ, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(InterfaceC59997ztZ interfaceC59997ztZ, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (str != null) {
            return str;
        }
        if (interfaceC59997ztZ == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(interfaceC59997ztZ.EZpvd());
        if (str2 != null) {
            str3 = '_' + str2;
            if (str3 == null) {
                str3 = "";
            }
        }
        sb.append(str3);
        return sb.toString();
    }

    public static final <T extends ViewModel> InterfaceC56387yDm<T> AEQbTJ(@NotNull final InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull final Function0<? extends ViewModelStore> function0, final java.lang.String str, @NotNull final Function0<? extends CreationExtras> function02, final InterfaceC59997ztZ interfaceC59997ztZ, @NotNull final C60060zuj c60060zuj, final Function0<? extends C60053zuc> function03) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        return C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.GetViewModelKt$lazyResolveViewModel$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStore> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                return C60003ztf.EZpvd(interfaceC56551yJo, function0.invoke(), str, function02.invoke(), interfaceC59997ztZ, c60060zuj, function03);
            }
        });
    }
}
