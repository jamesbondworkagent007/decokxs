package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dTg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13652dTg extends InterfaceC43217rlC {
    java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z);

    boolean AEQbTJ(@NotNull android.content.Context context);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z);

    /* JADX INFO: renamed from: o.dTg$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        public static /* synthetic */ void saveNewFile$default(InterfaceC13652dTg interfaceC13652dTg, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveNewFile");
            }
            if ((i & 8) != 0) {
                z = true;
            }
            interfaceC13652dTg.OLrzqt(str, str2, str3, z);
        }

        public static /* synthetic */ java.lang.String getFileContentByFileName$default(InterfaceC13652dTg interfaceC13652dTg, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFileContentByFileName");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return interfaceC13652dTg.AEQbTJ(str, z);
        }
    }
}
