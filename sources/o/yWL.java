package o;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes13.dex */
public final class yWL {
    public static final GeneratedMessageLite.Activity<ProtoBuf.Constructor, java.util.List<ProtoBuf.Annotation>> AEQbTJ;
    public static final GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> AYXKKw;
    public static final GeneratedMessageLite.Activity<ProtoBuf.Package, java.lang.Integer> AhwBna = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, WireFormat.FieldType.INT32, java.lang.Integer.class);
    public static final GeneratedMessageLite.Activity<ProtoBuf.Function, java.util.List<ProtoBuf.Annotation>> EZpvd;
    public static final GeneratedMessageLite.Activity<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> KWHzl;
    public static final GeneratedMessageLite.Activity<ProtoBuf.EnumEntry, java.util.List<ProtoBuf.Annotation>> OLrzqt;
    public static final GeneratedMessageLite.Activity<ProtoBuf.Class, java.util.List<ProtoBuf.Annotation>> copydefault;
    public static final GeneratedMessageLite.Activity<ProtoBuf.ValueParameter, java.util.List<ProtoBuf.Annotation>> djBIcL;
    public static final GeneratedMessageLite.Activity<ProtoBuf.TypeParameter, java.util.List<ProtoBuf.Annotation>> fetchVPNInfo;
    public static final GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> gEmmrt;
    public static final GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> valueOf;
    public static final GeneratedMessageLite.Activity<ProtoBuf.Type, java.util.List<ProtoBuf.Annotation>> values;

    public static void OLrzqt(yXE yxe) {
        yxe.KWHzl(AhwBna);
        yxe.KWHzl(copydefault);
        yxe.KWHzl(AEQbTJ);
        yxe.KWHzl(EZpvd);
        yxe.KWHzl(valueOf);
        yxe.KWHzl(AYXKKw);
        yxe.KWHzl(gEmmrt);
        yxe.KWHzl(KWHzl);
        yxe.KWHzl(OLrzqt);
        yxe.KWHzl(djBIcL);
        yxe.KWHzl(values);
        yxe.KWHzl(fetchVPNInfo);
    }

    static {
        ProtoBuf.Class defaultInstance = ProtoBuf.Class.getDefaultInstance();
        ProtoBuf.Annotation defaultInstance2 = ProtoBuf.Annotation.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        copydefault = GeneratedMessageLite.newRepeatedGeneratedExtension(defaultInstance, defaultInstance2, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        AEQbTJ = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Constructor.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        EZpvd = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        valueOf = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        AYXKKw = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, fieldType, false, ProtoBuf.Annotation.class);
        gEmmrt = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA, fieldType, false, ProtoBuf.Annotation.class);
        KWHzl = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.Argument.Value.getDefaultInstance(), ProtoBuf.Annotation.Argument.Value.getDefaultInstance(), null, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, fieldType, ProtoBuf.Annotation.Argument.Value.class);
        OLrzqt = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.EnumEntry.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        djBIcL = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.ValueParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        values = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        fetchVPNInfo = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
    }
}
