package o;

import com.just.agentweb.DefaultWebClient;
import com.okinc.network.okg.unifieddomain.DomainType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32609mgn {
    public static final C32609mgn copydefault = new C32609mgn();

    private C32609mgn() {
    }

    public final void AEQbTJ(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C55051xce c55051xce = C55051xce.OLrzqt;
        c55051xce.AEQbTJ(new Function2() { // from class: o.mgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C32609mgn.OLrzqt(context, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        c55051xce.AEQbTJ(5000L);
    }

    public static final Unit OLrzqt(android.content.Context context, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strEZpvd = C43386roM.EZpvd.EZpvd();
        if (strEZpvd != null) {
            java.lang.String str3 = strEZpvd + "/" + str;
            if (!C59449zhJ.startsWith$default(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str3).toString(), "http", false, 2, null)) {
                str3 = DefaultWebClient.HTTPS_SCHEME + str3;
            }
            java.lang.String str4 = str3;
            new C33143mqr(context, str4, str2, null, DomainType.CDN, new TaskDescription(str4, str2)).EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mgn$TaskDescription */
    public static final class TaskDescription implements InterfaceC33145mqt {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String copydefault;

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
        }

        public TaskDescription(java.lang.String str, java.lang.String str2) {
            this.copydefault = str;
            this.EZpvd = str2;
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            C55051xce.OLrzqt.OLrzqt(this.copydefault, this.EZpvd, i, str);
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            C55051xce.OLrzqt.KWHzl(str);
        }
    }
}
