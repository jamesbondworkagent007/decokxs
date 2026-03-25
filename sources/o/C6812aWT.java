package o;

import com.okinc.biz.bean.enums.SupportChannelType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.aWT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6812aWT extends C6984aZg<SupportChannelType> {
    public C6812aWT() {
        super("SupportChannelType", new Function1() { // from class: o.aWW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6812aWT.copydefault((SupportChannelType) obj);
            }
        }, new Function1() { // from class: o.aWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6812aWT.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String copydefault(SupportChannelType supportChannelType) {
        Intrinsics.checkNotNullParameter(supportChannelType, "");
        return supportChannelType.getValue();
    }

    public static final SupportChannelType KWHzl(java.lang.String str) {
        SupportChannelType supportChannelType;
        Intrinsics.checkNotNullParameter(str, "");
        SupportChannelType[] supportChannelTypeArrValues = SupportChannelType.values();
        int length = supportChannelTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                supportChannelType = null;
                break;
            }
            supportChannelType = supportChannelTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) supportChannelType.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return supportChannelType == null ? SupportChannelType.Chatbot : supportChannelType;
    }
}
