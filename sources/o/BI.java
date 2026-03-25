package o;

import aws.smithy.kotlin.runtime.io.middleware.Phase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface BI extends InterfaceC5076Du<BP<C5036Cg>> {
    void copydefault(@NotNull BY<?, ?> by);

    public static final class Activity {
        /* JADX DEBUG: Class process forced to load method for inline: aws.smithy.kotlin.runtime.io.middleware.Phase.register$default(aws.smithy.kotlin.runtime.io.middleware.Phase, o.Du, aws.smithy.kotlin.runtime.io.middleware.Phase$Order, int, java.lang.Object):void */
        public static void KWHzl(@NotNull BI bi, @NotNull BY<?, ?> by) {
            Intrinsics.checkNotNullParameter(by, "");
            Phase.register$default(by.copydefault().copydefault(), bi, (Phase.Order) null, 2, (java.lang.Object) null);
        }
    }
}
