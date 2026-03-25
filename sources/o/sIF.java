package o;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao;
import com.okinc.okimcore.feature.database.InHouseIMDatabase;
import com.okinc.okimcore.feature.database.OKRoomDatabase$closeDatabase$1;
import com.okinc.okimcore.feature.database.OKRoomDatabase$onUserLogin$1;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageTagsDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import o.sIF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sIF implements sIC {
    public final android.content.Context EZpvd;
    public volatile InHouseIMDatabase KWHzl;
    public sIB copydefault;
    public final InterfaceC47278tmy djBIcL;
    public final java.lang.Object gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final Migration[] OLrzqt = {C44243sIp.fJNWhG(), C44243sIp.ejfBZ(), C44243sIp.iwGUEr(), C44243sIp.getNewProxyInstance(), C44243sIp.getFieldNames(), C44243sIp.hDKMBd(), C44243sIp.OLrzqt(), C44243sIp.copydefault(), C44243sIp.KWHzl(), C44243sIp.EZpvd(), C44243sIp.AEQbTJ(), C44243sIp.AhwBna(), C44243sIp.valueOf(), C44243sIp.djBIcL(), C44243sIp.gEmmrt(), C44243sIp.AYXKKw(), C44243sIp.fetchVPNInfo(), C44243sIp.isConnected(), C44243sIp.values(), C44243sIp.AkhnZx(), C44243sIp.DbNXlk(), C44243sIp.fIwbmz(), C44243sIp.AuCTel(), C44243sIp.fARcdN()};

    @yCM
    public sIF(@NotNull android.content.Context context, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.EZpvd = context;
        this.djBIcL = interfaceC47278tmy;
        this.gEmmrt = new java.lang.Object();
    }

    public static final class Application implements sIB {
        public final InterfaceC56387yDm AEQbTJ;

        public Application(final sIF sif) {
            this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sIE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return sIF.Application.KWHzl(sif);
                }
            });
        }

        public final InHouseIMDatabase values() {
            return (InHouseIMDatabase) this.AEQbTJ.getValue();
        }

        public static final InHouseIMDatabase KWHzl(sIF sif) {
            InHouseIMDatabase inHouseIMDatabaseAhwBna = sif.AhwBna();
            pUU.KWHzl("InHouseIMDatabase", "Repository initialized with DB: " + java.lang.System.identityHashCode(inHouseIMDatabaseAhwBna));
            return inHouseIMDatabaseAhwBna;
        }

        @Override // o.sIB
        public InHouseIMConversationSimpleInfoDao AEQbTJ() {
            return values().OLrzqt();
        }

        @Override // o.sIB
        public InHouseIMConversationDao KWHzl() {
            return values().AEQbTJ();
        }

        @Override // o.sIB
        public InHouseIMContactDao OLrzqt() {
            return values().copydefault();
        }

        @Override // o.sIB
        public InHouseIMMessageDao gEmmrt() {
            return values().gEmmrt();
        }

        @Override // o.sIB
        public InHouseIMMessageTagsDao djBIcL() {
            return values().valueOf();
        }

        @Override // o.sIB
        public InHouseIMGroupMemberDao AYXKKw() {
            return values().djBIcL();
        }

        @Override // o.sIB
        public InHouseIMGroupInfoDao EZpvd() {
            return values().EZpvd();
        }

        @Override // o.sIB
        public InHouseIMGroupSettingDao valueOf() {
            return values().AYXKKw();
        }

        @Override // o.sIB
        public InHouseIMMessageHandlingDao AhwBna() {
            return values().AhwBna();
        }

        @Override // o.sIB
        public PhoneRelationEntityDao AkhnZx() {
            return values().DbNXlk();
        }

        @Override // o.sIB
        public EmojiReactionDao copydefault() {
            return values().KWHzl();
        }
    }

    public final Application AEQbTJ() {
        return new Application(this);
    }

    @Override // o.sEH
    public void bp_() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(sDN.copydefault.copydefault()), null, null, new OKRoomDatabase$onUserLogin$1(this, null), 3, null);
    }

    @Override // o.sEH
    public void bq_() {
        InHouseIMDatabase inHouseIMDatabase;
        synchronized (this.gEmmrt) {
            inHouseIMDatabase = this.KWHzl;
            this.KWHzl = null;
            this.copydefault = null;
            C44124sEe.copydefault("InHouseIMDatabase", "closeDatabase: lock released, db reference captured");
            Unit unit = Unit.INSTANCE;
        }
        OLrzqt(inHouseIMDatabase);
    }

    @Override // o.sIC
    public sIB copydefault() {
        sIB sib = this.copydefault;
        if (sib != null) {
            return sib;
        }
        Application applicationAEQbTJ = AEQbTJ();
        this.copydefault = applicationAEQbTJ;
        return applicationAEQbTJ;
    }

    public final java.lang.String EZpvd() {
        if (this.djBIcL.values()) {
            return C44157sFk.copydefault(this.djBIcL);
        }
        java.lang.String strCopydefault = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        return strCopydefault;
    }

    public final InHouseIMDatabase AhwBna() {
        InHouseIMDatabase inHouseIMDatabaseOLrzqt;
        synchronized (this.gEmmrt) {
            inHouseIMDatabaseOLrzqt = this.KWHzl;
            if (inHouseIMDatabaseOLrzqt == null) {
                inHouseIMDatabaseOLrzqt = OLrzqt();
                this.KWHzl = inHouseIMDatabaseOLrzqt;
            }
        }
        return inHouseIMDatabaseOLrzqt;
    }

    public final Job OLrzqt(InHouseIMDatabase inHouseIMDatabase) {
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(sDN.copydefault.copydefault()), null, null, new OKRoomDatabase$closeDatabase$1(inHouseIMDatabase, null), 3, null);
    }

    public final InHouseIMDatabase OLrzqt() {
        java.lang.String strEZpvd = EZpvd();
        java.lang.String strAEQbTJ = C33485mxO.AEQbTJ(strEZpvd);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format("in_house_im_%s", java.util.Arrays.copyOf(new java.lang.Object[]{strAEQbTJ}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44124sEe.copydefault("InHouseIMDatabase", "checkDatabase: isLoggedIn=" + this.djBIcL.values());
        C44124sEe.copydefault("InHouseIMDatabase", "checkDatabase: fileId=" + strEZpvd);
        C44124sEe.copydefault("InHouseIMDatabase", "checkDatabase: fileIdMd5=" + strAEQbTJ);
        C44124sEe.copydefault("InHouseIMDatabase", "checkDatabase: dbFileName=" + str);
        return OLrzqt(str, strEZpvd);
    }

    public final InHouseIMDatabase OLrzqt(java.lang.String str, java.lang.String str2) {
        RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(this.EZpvd, InHouseIMDatabase.class, str);
        Migration[] migrationArr = OLrzqt;
        InHouseIMDatabase inHouseIMDatabase = (InHouseIMDatabase) builderDatabaseBuilder.addMigrations((Migration[]) java.util.Arrays.copyOf(migrationArr, migrationArr.length)).addAutoMigrationSpec(new C44240sIm()).fallbackToDestructiveMigration(true).build();
        C44124sEe.copydefault("InHouseIMDatabase", "openDatabase: db opened, fileId=" + str2);
        C44124sEe.copydefault("InHouseIMDatabase", "openDatabase: db opened, dbName=" + str);
        C44124sEe.copydefault("InHouseIMDatabase", "openDatabase: db opened, db=" + inHouseIMDatabase);
        return inHouseIMDatabase;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sIF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
