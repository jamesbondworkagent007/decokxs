package o;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import o.InterfaceC56657yNm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yNG extends CallableMemberDescriptor {

    public interface StateListAnimator<D extends yNG> {
        StateListAnimator<D> AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu);

        StateListAnimator<D> AEQbTJ(InterfaceC56679yOh interfaceC56679yOh);

        D AEQbTJ();

        StateListAnimator<D> EZpvd();

        StateListAnimator<D> EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF);

        StateListAnimator<D> EZpvd(@NotNull AbstractC59325zes abstractC59325zes);

        StateListAnimator<D> KWHzl();

        StateListAnimator<D> KWHzl(CallableMemberDescriptor callableMemberDescriptor);

        <V> StateListAnimator<D> KWHzl(@NotNull InterfaceC56657yNm.Application<V> application, V v);

        StateListAnimator<D> KWHzl(boolean z);

        StateListAnimator<D> OLrzqt();

        StateListAnimator<D> OLrzqt(@NotNull java.util.List<InterfaceC56695yOx> list);

        StateListAnimator<D> copydefault();

        StateListAnimator<D> copydefault(@NotNull java.util.List<InterfaceC56691yOt> list);

        StateListAnimator<D> copydefault(@NotNull CallableMemberDescriptor.Kind kind);

        StateListAnimator<D> copydefault(@NotNull Modality modality);

        StateListAnimator<D> copydefault(@NotNull yNC ync);

        StateListAnimator<D> copydefault(@NotNull yOL yol);

        StateListAnimator<D> copydefault(InterfaceC56679yOh interfaceC56679yOh);

        StateListAnimator<D> copydefault(@NotNull C56935yXu c56935yXu);

        StateListAnimator<D> valueOf();
    }

    @Override // o.InterfaceC56666yNv, o.InterfaceC56665yNu
    InterfaceC56665yNu AYXKKw();

    boolean AuCTelauCTel();

    boolean AubY();

    boolean AwvSrB();

    boolean AxsJAY();

    boolean EZpvd();

    boolean KWHzl();

    yNG OLrzqt(@NotNull TypeSubstitutor typeSubstitutor);

    yNG iwGUEr();

    StateListAnimator<? extends yNG> sSMYrx();

    yNG uzCIH();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, o.InterfaceC56657yNm
    java.util.Collection<? extends yNG> valueOf();

    boolean wlaJM();
}
