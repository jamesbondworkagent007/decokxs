package aws.smithy.kotlin.runtime.client.config;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ClientSettings$LogMode$1 extends FunctionReferenceImpl implements Function1<String, AbstractC54779xV> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ClientSettings$LogMode$1(Object obj) {
        super(1, obj, AbstractC54779xV.TaskDescription.class, "fromString", "fromString(Ljava/lang/String;)Laws/smithy/kotlin/runtime/client/LogMode;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final AbstractC54779xV invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((AbstractC54779xV.TaskDescription) this.receiver).KWHzl(str);
    }
}
