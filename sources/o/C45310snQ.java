package o;

import com.okinc.okex.common.notification.Priority;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C45310snQ implements KSerializer<Priority> {
    public static final C45310snQ copydefault = new C45310snQ();
    public static final SerialDescriptor EZpvd = SerialDescriptorsKt.PrimitiveSerialDescriptor("Priority", PrimitiveKind.STRING.INSTANCE);
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.snQ$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Priority.values().length];
            try {
                iArr[Priority.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return EZpvd;
    }

    private C45310snQ() {
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull Priority priority) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(priority, "");
        if (ActionBar.OLrzqt[priority.ordinal()] == 1) {
            str = "UNKNOWN";
        } else {
            str = "P" + StringsKt__StringsKt.KWHzl(priority.name(), (java.lang.CharSequence) "PRIORITY_");
        }
        encoder.encodeString(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [65=6] */
    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Priority deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        java.lang.String strDecodeString = decoder.decodeString();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strDecodeString.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 109168) {
            switch (iHashCode) {
                case 3520:
                    if (lowerCase.equals("p0")) {
                        return Priority.PRIORITY_0;
                    }
                    break;
                case 3521:
                    if (lowerCase.equals("p1")) {
                        return Priority.PRIORITY_1;
                    }
                    break;
                case 3522:
                    if (lowerCase.equals("p2")) {
                        return Priority.PRIORITY_2;
                    }
                    break;
                case 3523:
                    if (lowerCase.equals("p3")) {
                        return Priority.PRIORITY_3;
                    }
                    break;
                case 3524:
                    if (lowerCase.equals("p4")) {
                        return Priority.PRIORITY_4;
                    }
                    break;
            }
        } else if (lowerCase.equals("p00")) {
            return Priority.PRIORITY_00;
        }
        return Priority.UNKNOWN;
    }
}
