package o;

/* JADX INFO: renamed from: o.ynl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57722ynl implements InterfaceC57718ynh<android.os.PersistableBundle> {
    public android.os.PersistableBundle EZpvd = new android.os.PersistableBundle();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
    @Override // o.InterfaceC57718ynh
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.os.PersistableBundle OLrzqt() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC57718ynh
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        this.EZpvd.putString(str, str2);
    }

    @Override // o.InterfaceC57718ynh
    public void copydefault(java.lang.String str, java.lang.Long l) {
        this.EZpvd.putLong(str, l.longValue());
    }

    @Override // o.InterfaceC57718ynh
    public java.lang.String copydefault(java.lang.String str) {
        return this.EZpvd.getString(str);
    }

    @Override // o.InterfaceC57718ynh
    public java.lang.Integer OLrzqt(java.lang.String str) {
        return java.lang.Integer.valueOf(this.EZpvd.getInt(str));
    }

    @Override // o.InterfaceC57718ynh
    public java.lang.Long KWHzl(java.lang.String str) {
        return java.lang.Long.valueOf(this.EZpvd.getLong(str));
    }

    @Override // o.InterfaceC57718ynh
    public boolean EZpvd(java.lang.String str, boolean z) {
        return this.EZpvd.getBoolean(str, z);
    }

    @Override // o.InterfaceC57718ynh
    public boolean EZpvd(java.lang.String str) {
        return this.EZpvd.containsKey(str);
    }
}
