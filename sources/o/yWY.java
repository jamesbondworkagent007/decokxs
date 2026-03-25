package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yWY {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Activity<M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage<M>, T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T KWHzl(@NotNull GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @NotNull GeneratedMessageLite.Activity<M, T> activity) {
        Intrinsics.checkNotNullParameter(extendableMessage, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (extendableMessage.hasExtension(activity)) {
            return (T) extendableMessage.getExtension(activity);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Activity<M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage<M>, java.util.List<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T OLrzqt(@NotNull GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @NotNull GeneratedMessageLite.Activity<M, java.util.List<T>> activity, int i) {
        Intrinsics.checkNotNullParameter(extendableMessage, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (i < extendableMessage.getExtensionCount(activity)) {
            return (T) extendableMessage.getExtension(activity, i);
        }
        return null;
    }
}
