package o;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class C27772kCu {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public android.util.LruCache<java.lang.String, java.util.List<CommonGroupData>> OLrzqt = new android.util.LruCache<>(20);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.util.LruCache<java.lang.String, java.util.List<CommonGroupData>> AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C27772kCu() {
    }

    /* JADX INFO: renamed from: o.kCu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.util.List<CommonGroupData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.put(str, list);
    }

    public final void KWHzl() {
        this.OLrzqt.evictAll();
    }
}
