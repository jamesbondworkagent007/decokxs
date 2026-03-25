package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.dns.DohTypeEnum;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43347rna {
    public static final C43347rna EZpvd = new C43347rna();

    /* JADX INFO: renamed from: o.rna$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DohTypeEnum.values().length];
            try {
                iArr[DohTypeEnum.DEXPRI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DohTypeEnum.V5.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DohTypeEnum.HTTP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    private C43347rna() {
    }

    public final SubdomainStrategy OLrzqt(@NotNull DohTypeEnum dohTypeEnum, java.lang.String str) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        int i = TaskDescription.EZpvd[dohTypeEnum.ordinal()];
        if (i == 1) {
            return SubdomainStrategy.Auto.KWHzl;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (str != null) {
            return SubdomainStrategy.Companion.copydefault(str);
        }
        return SubdomainStrategy.Auto.KWHzl;
    }

    public final boolean EZpvd() {
        return C43655rtQ.OLrzqt.AhwBna() != null;
    }
}
