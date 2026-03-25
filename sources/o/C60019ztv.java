package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60019ztv extends C60053zuc {
    public final CreationExtras copydefault;

    /* JADX WARN: Illegal instructions before constructor call */
    public C60019ztv(Function0<? extends C60053zuc> function0, @NotNull CreationExtras creationExtras) {
        C60053zuc c60053zucInvoke;
        java.util.List<java.lang.Object> listCopydefault;
        java.util.List listFJNWhG;
        Intrinsics.checkNotNullParameter(creationExtras, "");
        super((function0 == null || (c60053zucInvoke = function0.invoke()) == null || (listCopydefault = c60053zucInvoke.copydefault()) == null || (listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) listCopydefault)) == null) ? new java.util.ArrayList() : listFJNWhG, null, 2, null);
        this.copydefault = creationExtras;
    }

    @Override // o.C60053zuc
    public <T> T OLrzqt(final int i, @NotNull final InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return (T) AEQbTJ(interfaceC56551yJo, new Function0<T>() { // from class: org.koin.androidx.viewmodel.parameter.AndroidParametersHolder$elementAt$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) super/*o.zuc*/.OLrzqt(i, (InterfaceC56551yJo<?>) interfaceC56551yJo);
            }
        });
    }

    @Override // o.C60053zuc
    public <T> T copydefault(@NotNull final InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return (T) AEQbTJ(interfaceC56551yJo, new Function0<T>() { // from class: org.koin.androidx.viewmodel.parameter.AndroidParametersHolder$getOrNull$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) super/*o.zuc*/.copydefault(interfaceC56551yJo);
            }
        });
    }

    public final <T> T AEQbTJ(InterfaceC56551yJo<?> interfaceC56551yJo, Function0<? extends T> function0) {
        if (Intrinsics.EZpvd(interfaceC56551yJo, C56524yIo.AEQbTJ(SavedStateHandle.class))) {
            return (T) SavedStateHandleSupport.createSavedStateHandle(this.copydefault);
        }
        return function0.invoke();
    }
}
