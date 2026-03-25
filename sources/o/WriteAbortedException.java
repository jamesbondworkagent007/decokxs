package o;

import aws.sdk.kotlin.runtime.region.DefaultRegionProviderChain$2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterruptedIOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class WriteAbortedException extends Boolean implements java.io.Closeable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WriteAbortedException() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteAbortedException(@NotNull HL hl, @NotNull InterfaceC56387yDm<? extends NotSerializableException> interfaceC56387yDm, @NotNull HH<ObjectStreamField> hh) {
        super(new AutoCloseable(hl), new Writer(hl), new ArrayStoreException(hh), new ArithmeticException(interfaceC56387yDm, hl));
        Intrinsics.checkNotNullParameter(hl, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(hh, "");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        for (AssertionError assertionError : AEQbTJ()) {
            if (assertionError instanceof java.io.Closeable) {
                ((java.io.Closeable) assertionError).close();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WriteAbortedException(HL hl, InterfaceC56387yDm interfaceC56387yDm, HH hh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        hl = (i & 1) != 0 ? HL.OLrzqt.copydefault() : hl;
        this(hl, (i & 2) != 0 ? C56392yDr.copydefault(new Function0<InterruptedIOException>() { // from class: aws.sdk.kotlin.runtime.region.DefaultRegionProviderChain$1
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final InterruptedIOException invoke() {
                return new InterruptedIOException();
            }
        }) : interfaceC56387yDm, (i & 4) != 0 ? HE.AEQbTJ(new DefaultRegionProviderChain$2(hl, null)) : hh);
    }
}
