package o;

import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sPm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44429sPm extends C44442sPz<ContactRelationType> {
    public C44429sPm() {
        super("ContactRelationType", ContactRelationType.values(), new Function1() { // from class: o.sPl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44429sPm.EZpvd((ContactRelationType) obj));
            }
        }, new Function1() { // from class: o.sPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44429sPm.KWHzl(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int EZpvd(ContactRelationType contactRelationType) {
        Intrinsics.checkNotNullParameter(contactRelationType, "");
        return contactRelationType.getApiValue();
    }

    public static final ContactRelationType KWHzl(int i) {
        ContactRelationType contactRelationType;
        ContactRelationType[] contactRelationTypeArrValues = ContactRelationType.values();
        int length = contactRelationTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                contactRelationType = null;
                break;
            }
            contactRelationType = contactRelationTypeArrValues[i2];
            if (contactRelationType.getApiValue() == i) {
                break;
            }
            i2++;
        }
        return contactRelationType == null ? ContactRelationType.UNKNOWN : contactRelationType;
    }
}
