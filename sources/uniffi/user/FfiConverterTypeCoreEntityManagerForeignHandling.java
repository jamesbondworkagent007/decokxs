package uniffi.user;

import kotlin.jvm.internal.Intrinsics;
import o.BzK;
import o.C4906Bvk;
import o.C60184zxu;
import o.InterfaceC4907Bvl;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeCoreEntityManagerForeignHandling extends BaseFfiConverterType<InterfaceC4907Bvl> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreEntityManagerForeignHandling INSTANCE = new FfiConverterTypeCoreEntityManagerForeignHandling();

    private FfiConverterTypeCoreEntityManagerForeignHandling() {
        super(BzK.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4907Bvl interfaceC4907Bvl) {
        Intrinsics.checkNotNullParameter(interfaceC4907Bvl, "");
        if (interfaceC4907Bvl instanceof C4906Bvk) {
            return Long.valueOf(((C4906Bvk) interfaceC4907Bvl).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4907Bvl createFromHandle(long j) {
        return new C4906Bvk(C60184zxu.INSTANCE, j);
    }
}
