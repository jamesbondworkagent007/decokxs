package o;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import o.VO;

/* JADX INFO: renamed from: o.Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5549Vz {
    public final JavaType EZpvd;

    public abstract AnnotatedConstructor AEQbTJ();

    public abstract AnnotatedMethod AEQbTJ(java.lang.String str, java.lang.Class<?>[] clsArr);

    @java.lang.Deprecated
    public abstract AnnotatedMethod AYXKKw();

    public abstract InterfaceC5621Yt<java.lang.Object, java.lang.Object> AhwBna();

    public abstract VO.StateListAnimator AkhnZx();

    public abstract WJ AuCTel();

    public abstract java.util.List<WT> EZpvd();

    public abstract JsonInclude.Value KWHzl(JsonInclude.Value value);

    public abstract AnnotatedMember KWHzl();

    public abstract JsonFormat.Value OLrzqt(JsonFormat.Value value);

    public abstract java.lang.Class<?>[] OLrzqt();

    public abstract AnnotatedMember copydefault();

    public abstract java.lang.Object copydefault(boolean z);

    public abstract java.util.Map<java.lang.Object, AnnotatedMember> djBIcL();

    public abstract java.util.List<AnnotatedMethod> ejfBZ();

    public abstract java.util.List<AnnotatedConstructor> fARcdN();

    public abstract java.util.List<WK<AnnotatedConstructor, JsonCreator.Mode>> fIwbmz();

    public abstract InterfaceC5609Yh fJNWhG();

    public abstract InterfaceC5621Yt<java.lang.Object, java.lang.Object> fetchVPNInfo();

    public AnnotatedMember gEmmrt() {
        return null;
    }

    public abstract java.util.Set<java.lang.String> getFieldNames();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType getNewProxyInstance() {
        return this.EZpvd;
    }

    public abstract java.util.List<WK<AnnotatedMethod, JsonCreator.Mode>> hDKMBd();

    public abstract java.util.List<WT> isConnected();

    public abstract C5576Xa iwGUEr();

    public abstract boolean uzCIH();

    public abstract AnnotatedMember valueOf();

    public abstract java.lang.Class<?> values();

    public AbstractC5549Vz(JavaType javaType) {
        this.EZpvd = javaType;
    }

    public java.lang.Class<?> DbNXlk() {
        return this.EZpvd.getRawClass();
    }

    public boolean zsXlph() {
        return AuCTel().fetchVPNInfo();
    }
}
