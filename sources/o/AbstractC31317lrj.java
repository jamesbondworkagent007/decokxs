package o;

import com.okinc.business.web3pay.lib.features.contacts.data.entity.Web3PayRecentContactEntity;
import com.okinc.business.web3pay.lib.features.contacts.model.ContactType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC31317lrj {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lrj.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC31317lrj(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String AEQbTJ();

    public abstract java.lang.String EZpvd();

    public abstract java.lang.String KWHzl();

    public abstract java.lang.String OLrzqt();

    public abstract java.lang.Long copydefault();

    public abstract long valueOf();

    private AbstractC31317lrj() {
    }

    public final Web3PayRecentContactEntity EZpvd(@NotNull java.lang.String str) {
        ContactType contactType;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Long lCopydefault = copydefault();
        java.lang.String strOLrzqt = OLrzqt();
        java.lang.String strAEQbTJ = AEQbTJ();
        java.lang.String strKWHzl = KWHzl();
        java.lang.String strEZpvd = EZpvd();
        if (this instanceof C31311lrd) {
            contactType = ContactType.EMAIL;
        } else if (this instanceof C31310lrc) {
            contactType = ContactType.PHONE_NUMBER;
        } else {
            if (!(this instanceof C31318lrk)) {
                throw new NoWhenBranchMatchedException();
            }
            contactType = ContactType.UID;
        }
        return new Web3PayRecentContactEntity(str, lCopydefault, strOLrzqt, strAEQbTJ, strKWHzl, strEZpvd, contactType, valueOf());
    }

    /* JADX INFO: renamed from: o.lrj$TaskDescription */
    public static final class TaskDescription {

        /* JADX INFO: renamed from: o.lrj$TaskDescription$Activity */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ContactType.values().length];
                try {
                    iArr[ContactType.UID.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ContactType.EMAIL.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ContactType.PHONE_NUMBER.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lrj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC31317lrj EZpvd(@NotNull Web3PayRecentContactEntity web3PayRecentContactEntity) {
            Intrinsics.checkNotNullParameter(web3PayRecentContactEntity, "");
            int i = Activity.OLrzqt[web3PayRecentContactEntity.getContactType().ordinal()];
            if (i == 1) {
                return new C31318lrk(web3PayRecentContactEntity.getContactId(), web3PayRecentContactEntity.getContactName(), web3PayRecentContactEntity.getContactAvatar(), web3PayRecentContactEntity.getContactDisplay(), web3PayRecentContactEntity.getContactInfo(), web3PayRecentContactEntity.getCreatedTime());
            }
            if (i == 2) {
                return new C31311lrd(web3PayRecentContactEntity.getContactId(), web3PayRecentContactEntity.getContactName(), web3PayRecentContactEntity.getContactAvatar(), web3PayRecentContactEntity.getContactDisplay(), web3PayRecentContactEntity.getContactInfo(), web3PayRecentContactEntity.getCreatedTime());
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return C31310lrc.Companion.EZpvd(web3PayRecentContactEntity.getContactId(), web3PayRecentContactEntity.getContactName(), web3PayRecentContactEntity.getContactAvatar(), web3PayRecentContactEntity.getContactDisplay(), web3PayRecentContactEntity.getContactInfo(), web3PayRecentContactEntity.getCreatedTime());
        }
    }
}
