package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C59443zhD;
import o.FA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5126Fs implements InterfaceC5100Es {
    public final C5101Et EZpvd;
    public final XmlStreamReader KWHzl;

    public C5126Fs(@NotNull XmlStreamReader xmlStreamReader, @NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(xmlStreamReader, "");
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.KWHzl = xmlStreamReader;
        this.EZpvd = c5101Et;
    }

    private final <T> T AEQbTJ(Function1<? super java.lang.String, ? extends T> function1) {
        T tInvoke;
        if (XmlStreamReader.StateListAnimator.peek$default(this.KWHzl, 0, 1, null) instanceof FA.ActionBar) {
            FA faAEQbTJ = this.KWHzl.AEQbTJ();
            if (faAEQbTJ == null) {
                throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.ActionBar.class) + " but instead found null");
            }
            if (faAEQbTJ.getClass() == FA.ActionBar.class) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((FA.ActionBar) faAEQbTJ).OLrzqt().AEQbTJ(), (java.lang.Object) C5119Fl.copydefault(this.EZpvd))) {
                    return (T) AEQbTJ(function1);
                }
            } else {
                throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.ActionBar.class) + "; found " + C56524yIo.AEQbTJ(faAEQbTJ.getClass()) + " (" + faAEQbTJ + ')');
            }
        }
        FA faAEQbTJ2 = this.KWHzl.AEQbTJ();
        if (faAEQbTJ2 == null) {
            throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.Dialog.class) + " but instead found null");
        }
        if (faAEQbTJ2.getClass() == FA.Dialog.class) {
            FA.Dialog dialog = (FA.Dialog) faAEQbTJ2;
            java.lang.String strOLrzqt = dialog.OLrzqt();
            if (strOLrzqt == null || (tInvoke = function1.invoke(strOLrzqt)) == null) {
                throw new DeserializationException(dialog + " specifies nonexistent or invalid value.");
            }
            FA faAEQbTJ3 = this.KWHzl.AEQbTJ();
            if (faAEQbTJ3 == null) {
                throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.StateListAnimator.class) + " but instead found null");
            }
            if (faAEQbTJ3.getClass() == FA.StateListAnimator.class) {
                return tInvoke;
            }
            throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.StateListAnimator.class) + "; found " + C56524yIo.AEQbTJ(faAEQbTJ3.getClass()) + " (" + faAEQbTJ3 + ')');
        }
        throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.Dialog.class) + "; found " + C56524yIo.AEQbTJ(faAEQbTJ2.getClass()) + " (" + faAEQbTJ2 + ')');
    }

    @Override // o.InterfaceC5100Es
    public int djBIcL() {
        return ((java.lang.Number) AEQbTJ(new Function1<java.lang.String, java.lang.Integer>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlPrimitiveDeserializer$deserializeInt$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
                if (intOrNull != null) {
                    return Integer.valueOf(intOrNull.intValue());
                }
                throw new DeserializationException("Unable to deserialize " + str + " as Int");
            }
        })).intValue();
    }

    @Override // o.InterfaceC5100Es
    public long AYXKKw() {
        return ((java.lang.Number) AEQbTJ(new Function1<java.lang.String, java.lang.Long>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlPrimitiveDeserializer$deserializeLong$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
                if (fieldNames != null) {
                    return Long.valueOf(fieldNames.longValue());
                }
                throw new DeserializationException("Unable to deserialize " + str + " as Long");
            }
        })).longValue();
    }

    @Override // o.InterfaceC5100Es
    public float valueOf() {
        return ((java.lang.Number) AEQbTJ(new Function1<java.lang.String, java.lang.Float>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlPrimitiveDeserializer$deserializeFloat$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Float invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Float fFIwbmz = C59443zhD.fIwbmz(str);
                if (fFIwbmz != null) {
                    return Float.valueOf(fFIwbmz.floatValue());
                }
                throw new DeserializationException("Unable to deserialize " + str + " as Float");
            }
        })).floatValue();
    }

    @Override // o.InterfaceC5100Es
    public double AhwBna() {
        return ((java.lang.Number) AEQbTJ(new Function1<java.lang.String, java.lang.Double>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlPrimitiveDeserializer$deserializeDouble$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Double invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Double dAuCTel = C59443zhD.AuCTel(str);
                if (dAuCTel != null) {
                    return Double.valueOf(dAuCTel.doubleValue());
                }
                throw new DeserializationException("Unable to deserialize " + str + " as Double");
            }
        })).doubleValue();
    }

    @Override // o.InterfaceC5100Es
    public java.lang.String fetchVPNInfo() {
        return (java.lang.String) AEQbTJ(new Function1<java.lang.String, java.lang.String>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlPrimitiveDeserializer$deserializeString$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return str;
            }
        });
    }

    @Override // o.InterfaceC5100Es
    public boolean AEQbTJ() {
        return ((java.lang.Boolean) AEQbTJ(new Function1<java.lang.String, java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlPrimitiveDeserializer$deserializeBoolean$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC5100Es
    public java.lang.Void gEmmrt() {
        boolean z;
        if (this.KWHzl.AEQbTJ() == null) {
            throw new DeserializationException("Unexpected end of stream");
        }
        XmlStreamReader xmlStreamReader = this.KWHzl;
        FA faOLrzqt = xmlStreamReader.OLrzqt();
        do {
            z = faOLrzqt instanceof FA.StateListAnimator;
            if (!z) {
                faOLrzqt = xmlStreamReader.AEQbTJ();
            }
            if (faOLrzqt == null) {
                break;
            }
        } while (!z);
        if (this.KWHzl.AEQbTJ() != null) {
            return null;
        }
        throw new DeserializationException("Unexpected end of stream");
    }
}
