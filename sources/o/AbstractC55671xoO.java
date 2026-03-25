package o;

import com.okinc.tradeapi.bean.IndexTickersData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55671xoO extends AbstractC55755xpt<IndexTickersData> {
    public final java.lang.String EZpvd;
    public final java.lang.String djBIcL;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55671xoO(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        super(null, null, str, null, str2, null, 43, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.valueOf = "IndexTickersListener-" + str;
        this.djBIcL = "IndexTickersListener";
    }
}
