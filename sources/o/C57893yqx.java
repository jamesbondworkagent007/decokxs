package o;

/* JADX INFO: renamed from: o.yqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57893yqx {
    public static boolean OLrzqt(android.content.Context context, android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }
}
