package o;

import com.okinc.business.defi.api.bean.NostrSignType;
import com.okinc.business.defi.api.model.tx.signdata.NostrMessageSignData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.nostr.NostrEncryptEvent;
import com.okinc.wallet.core.sign.nostr.NostrMessageEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bUR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9375bUR extends AbstractC12442cmy {
    public final C9370bUM EZpvd;

    /* JADX INFO: renamed from: o.bUR$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NostrSignType.values().length];
            try {
                iArr[NostrSignType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[NostrSignType.ENCRYPT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[NostrSignType.DECRYPT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9375bUR(@NotNull C9370bUM c9370bUM) {
        super(c9370bUM);
        Intrinsics.checkNotNullParameter(c9370bUM, "");
        this.EZpvd = c9370bUM;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SignParams signParams = new SignParams(this.EZpvd.dHguZz().QKVWgx(), this.EZpvd.dHguZz().fetchVPNInfo(), null, str, null, null, 0, null, false, false, null, 2036, null);
        int i = ActionBar.AEQbTJ[((NostrMessageSignData) this.EZpvd.QVsKAR()).getNostrSignType().ordinal()];
        if (i == 1) {
            return C54894xZg.OLrzqt.copydefault(signParams, (NostrMessageEvent) C54907xZt.OLrzqt(NostrMessageEvent.Companion.serializer(), str2));
        }
        if (i == 2) {
            return C54894xZg.OLrzqt.KWHzl(signParams, (NostrEncryptEvent) C54907xZt.OLrzqt(NostrEncryptEvent.Companion.serializer(), str2));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C54894xZg.OLrzqt.EZpvd(signParams, (NostrEncryptEvent) C54907xZt.OLrzqt(NostrEncryptEvent.Companion.serializer(), str2));
    }
}
