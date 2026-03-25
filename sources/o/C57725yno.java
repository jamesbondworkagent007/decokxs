package o;

/* JADX INFO: renamed from: o.yno, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57725yno implements InterfaceC57718ynh<android.os.Bundle> {
    public android.os.Bundle AEQbTJ = new android.os.Bundle();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
    @Override // o.InterfaceC57718ynh
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.os.Bundle OLrzqt() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC57718ynh
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        this.AEQbTJ.putString(str, str2);
    }

    @Override // o.InterfaceC57718ynh
    public void copydefault(java.lang.String str, java.lang.Long l) {
        this.AEQbTJ.putLong(str, l.longValue());
    }

    @Override // o.InterfaceC57718ynh
    public java.lang.String copydefault(java.lang.String str) {
        return this.AEQbTJ.getString(str);
    }

    @Override // o.InterfaceC57718ynh
    public java.lang.Integer OLrzqt(java.lang.String str) {
        return java.lang.Integer.valueOf(this.AEQbTJ.getInt(str));
    }

    @Override // o.InterfaceC57718ynh
    public java.lang.Long KWHzl(java.lang.String str) {
        return java.lang.Long.valueOf(this.AEQbTJ.getLong(str));
    }

    @Override // o.InterfaceC57718ynh
    public boolean EZpvd(java.lang.String str) {
        return this.AEQbTJ.containsKey(str);
    }

    @Override // o.InterfaceC57718ynh
    public boolean EZpvd(java.lang.String str, boolean z) {
        return this.AEQbTJ.getBoolean(str, z);
    }
}
