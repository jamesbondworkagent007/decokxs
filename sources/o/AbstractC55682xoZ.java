package o;

import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55682xoZ extends AbstractC55755xpt<OpenInterestData> {
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55682xoZ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        super(null, null, str, null, str2, null, 43, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.valueOf = "OpenInterestListener-" + str;
        this.KWHzl = "OpenInterestListener";
    }
}
