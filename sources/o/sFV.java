package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.ContactEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sFV implements sFU, sEH {
    public final sFS AEQbTJ;
    public final sFR EZpvd;
    public final sFP KWHzl;
    public final C44175sGb OLrzqt;
    public final sFN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFZ
    public Flow<com.okinc.okimcore.model.remote.UserInfo> AEQbTJ() {
        return this.OLrzqt.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFQ
    public void AEQbTJ(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.copydefault.AEQbTJ(oKConversation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFO
    public void EZpvd(@NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        this.EZpvd.EZpvd(groupInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFZ
    public void EZpvd(@NotNull com.okinc.okimcore.model.remote.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "");
        this.OLrzqt.EZpvd(userInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFK
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFQ
    public void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.EZpvd(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFK
    public RelationInfo KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFW
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFQ
    public void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.KWHzl(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFO
    public GroupInfo OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.OLrzqt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFW
    public GroupMemberInfo OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.AEQbTJ.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFZ
    public com.okinc.okimcore.model.remote.UserInfo OLrzqt() {
        return this.OLrzqt.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFW
    public void OLrzqt(GroupMemberInfo groupMemberInfo) {
        this.AEQbTJ.OLrzqt(groupMemberInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFK
    public void OLrzqt(@NotNull ContactEntity contactEntity) {
        Intrinsics.checkNotNullParameter(contactEntity, "");
        this.KWHzl.OLrzqt(contactEntity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFQ
    public void OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.OLrzqt(str, z);
    }

    @Override // o.sEH
    public void bp_() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFQ
    public OKConversation copydefault(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return this.copydefault.copydefault(oKConversation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFQ
    public OKConversation copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFK
    public RelationInfo copydefault() {
        return this.KWHzl.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFQ
    public java.lang.Object copydefault(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super C44461sQr> continuation) {
        return this.copydefault.copydefault(oKMessage, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFW
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFK
    public void copydefault(@NotNull java.lang.String str, @NotNull C44461sQr c44461sQr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c44461sQr, "");
        this.KWHzl.copydefault(str, c44461sQr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sFQ
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.copydefault(str, z);
    }

    @yCM
    public sFV(@NotNull sFN sfn, @NotNull sFS sfs, @NotNull sFP sfp, @NotNull C44175sGb c44175sGb, @NotNull sFR sfr) {
        Intrinsics.checkNotNullParameter(sfn, "");
        Intrinsics.checkNotNullParameter(sfs, "");
        Intrinsics.checkNotNullParameter(sfp, "");
        Intrinsics.checkNotNullParameter(c44175sGb, "");
        Intrinsics.checkNotNullParameter(sfr, "");
        this.copydefault = sfn;
        this.AEQbTJ = sfs;
        this.KWHzl = sfp;
        this.OLrzqt = c44175sGb;
        this.EZpvd = sfr;
    }

    @Override // o.sEH
    public void bq_() {
        java.util.Iterator it = yDY.gEmmrt(this.copydefault, this.AEQbTJ, this.KWHzl).iterator();
        while (it.hasNext()) {
            ((sFJ) it.next()).KWHzl();
        }
    }
}
