package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: renamed from: o.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5565Wp {
    public java.lang.Object EZpvd;
    public LinkedList<Activity> KWHzl;
    public InterfaceC5500Ud OLrzqt;
    public final ObjectIdGenerator.IdKey copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(InterfaceC5500Ud interfaceC5500Ud) {
        this.OLrzqt = interfaceC5500Ud;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectIdGenerator.IdKey EZpvd() {
        return this.copydefault;
    }

    public boolean copydefault(DeserializationContext deserializationContext) {
        return false;
    }

    public C5565Wp(ObjectIdGenerator.IdKey idKey) {
        this.copydefault = idKey;
    }

    public void AEQbTJ(Activity activity) {
        if (this.KWHzl == null) {
            this.KWHzl = new LinkedList<>();
        }
        this.KWHzl.add(activity);
    }

    public void AEQbTJ(java.lang.Object obj) throws java.io.IOException {
        this.OLrzqt.EZpvd(this.copydefault, obj);
        this.EZpvd = obj;
        java.lang.Object obj2 = this.copydefault.key;
        LinkedList<Activity> linkedList = this.KWHzl;
        if (linkedList != null) {
            java.util.Iterator<Activity> it = linkedList.iterator();
            this.KWHzl = null;
            while (it.hasNext()) {
                it.next().copydefault(obj2, obj);
            }
        }
    }

    public java.lang.Object OLrzqt() {
        java.lang.Object objAEQbTJ = this.OLrzqt.AEQbTJ(this.copydefault);
        this.EZpvd = objAEQbTJ;
        return objAEQbTJ;
    }

    public boolean KWHzl() {
        LinkedList<Activity> linkedList = this.KWHzl;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public java.util.Iterator<Activity> copydefault() {
        LinkedList<Activity> linkedList = this.KWHzl;
        if (linkedList == null) {
            return Collections.emptyList().iterator();
        }
        return linkedList.iterator();
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.copydefault);
    }

    /* JADX INFO: renamed from: o.Wp$Activity */
    public static abstract class Activity {
        public final java.lang.Class<?> AhwBna;
        public final UnresolvedForwardReference gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.Class<?> KWHzl() {
            return this.AhwBna;
        }

        public abstract void copydefault(java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException;

        public Activity(UnresolvedForwardReference unresolvedForwardReference, java.lang.Class<?> cls) {
            this.gEmmrt = unresolvedForwardReference;
            this.AhwBna = cls;
        }

        public Activity(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.gEmmrt = unresolvedForwardReference;
            this.AhwBna = javaType.getRawClass();
        }

        public JsonLocation AEQbTJ() {
            return this.gEmmrt.getLocation();
        }

        public boolean EZpvd(java.lang.Object obj) {
            return obj.equals(this.gEmmrt.getUnresolvedId());
        }
    }
}
