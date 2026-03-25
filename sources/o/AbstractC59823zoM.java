package o;

/* JADX INFO: renamed from: o.zoM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@java.lang.Deprecated
public abstract class AbstractC59823zoM implements InterfaceC59824zoN {
    public long getLongParameter(java.lang.String str, long j) {
        java.lang.Object parameter = getParameter(str);
        return parameter == null ? j : ((java.lang.Long) parameter).longValue();
    }

    public InterfaceC59824zoN setLongParameter(java.lang.String str, long j) {
        setParameter(str, java.lang.Long.valueOf(j));
        return this;
    }

    public int getIntParameter(java.lang.String str, int i) {
        java.lang.Object parameter = getParameter(str);
        return parameter == null ? i : ((java.lang.Integer) parameter).intValue();
    }

    public InterfaceC59824zoN setIntParameter(java.lang.String str, int i) {
        setParameter(str, java.lang.Integer.valueOf(i));
        return this;
    }

    public double getDoubleParameter(java.lang.String str, double d) {
        java.lang.Object parameter = getParameter(str);
        return parameter == null ? d : ((java.lang.Double) parameter).doubleValue();
    }

    public InterfaceC59824zoN setDoubleParameter(java.lang.String str, double d) {
        setParameter(str, java.lang.Double.valueOf(d));
        return this;
    }

    public boolean getBooleanParameter(java.lang.String str, boolean z) {
        java.lang.Object parameter = getParameter(str);
        return parameter == null ? z : ((java.lang.Boolean) parameter).booleanValue();
    }

    public InterfaceC59824zoN setBooleanParameter(java.lang.String str, boolean z) {
        setParameter(str, z ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
        return this;
    }

    public boolean isParameterTrue(java.lang.String str) {
        return getBooleanParameter(str, false);
    }

    public boolean isParameterFalse(java.lang.String str) {
        return !getBooleanParameter(str, false);
    }

    public java.util.Set<java.lang.String> getNames() {
        throw new java.lang.UnsupportedOperationException();
    }
}
