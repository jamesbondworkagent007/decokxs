package aws.sdk.kotlin.runtime.auth.credentials;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.HL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ProfileCredentialsProvider$namedProviders$1 extends FunctionReferenceImpl implements Function1<String, String> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProfileCredentialsProvider$namedProviders$1(Object obj) {
        super(1, obj, HL.class, "getenv", "getenv(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((HL) this.receiver).EZpvd(str);
    }
}
