package o;

import com.amplifyframework.auth.AWSCredentialsProvider;
import com.amplifyframework.auth.AWSTemporaryCredentials;
import com.amplifyframework.auth.AuthException;
import com.okinc.liveness.eop.viewmodel.ProxyAWSCredentialProvider$fetchAWSCredentials$1;
import com.okinc.network.okg.dns.DohTypeEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.Character;
import o.DL;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38260pSe implements AWSCredentialsProvider<AWSTemporaryCredentials> {
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;

    public C38260pSe(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
    }

    @Override // com.amplifyframework.auth.AWSCredentialsProvider
    public void fetchAWSCredentials(@NotNull com.amplifyframework.core.Consumer<AWSTemporaryCredentials> consumer, @NotNull com.amplifyframework.core.Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        final AU au = new AU(AS.fetchVPNInfo.KWHzl(), new java.util.function.Consumer() { // from class: o.pSa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                C38260pSe.copydefault((OkHttpClient.Builder) obj);
            }
        });
        final java.lang.String strFJNWhG = C43292rmY.OLrzqt.fJNWhG();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ProxyAWSCredentialProvider$fetchAWSCredentials$1(consumer, consumer2, Character.OLrzqt.copydefault(new Function1() { // from class: o.pSd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38260pSe.AEQbTJ(au, strFJNWhG, this, (Character.Activity.TaskDescription) obj);
            }
        }), this, null), 3, null);
    }

    public static final void copydefault(OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
        builder.addInterceptor(new C43334rnN(dohTypeEnum)).dns(new C43337rnQ(dohTypeEnum)).connectTimeout(10L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public static final Unit AEQbTJ(AU au, java.lang.String str, C38260pSe c38260pSe, Character.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.AEQbTJ(au);
        taskDescription.OLrzqt(DL.StateListAnimator.parse$default(DL.AEQbTJ, str + c38260pSe.EZpvd, null, 2, null));
        return Unit.INSTANCE;
    }
}
