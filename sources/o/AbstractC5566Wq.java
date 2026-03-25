package o;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

/* JADX INFO: renamed from: o.Wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5566Wq {
    public final java.lang.Object AEQbTJ;
    public final AbstractC5566Wq EZpvd;

    public abstract void copydefault(java.lang.Object obj) throws java.io.IOException;

    public AbstractC5566Wq(AbstractC5566Wq abstractC5566Wq, java.lang.Object obj) {
        this.EZpvd = abstractC5566Wq;
        this.AEQbTJ = obj;
    }

    /* JADX INFO: renamed from: o.Wq$ActionBar */
    public static final class ActionBar extends AbstractC5566Wq {
        public final SettableBeanProperty OLrzqt;

        public ActionBar(AbstractC5566Wq abstractC5566Wq, java.lang.Object obj, SettableBeanProperty settableBeanProperty) {
            super(abstractC5566Wq, obj);
            this.OLrzqt = settableBeanProperty;
        }

        @Override // o.AbstractC5566Wq
        public void copydefault(java.lang.Object obj) throws java.io.IOException {
            this.OLrzqt.set(obj, this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.Wq$Application */
    public static final class Application extends AbstractC5566Wq {
        public final java.lang.String OLrzqt;
        public final SettableAnyProperty copydefault;

        public Application(AbstractC5566Wq abstractC5566Wq, java.lang.Object obj, SettableAnyProperty settableAnyProperty, java.lang.String str) {
            super(abstractC5566Wq, obj);
            this.copydefault = settableAnyProperty;
            this.OLrzqt = str;
        }

        @Override // o.AbstractC5566Wq
        public void copydefault(java.lang.Object obj) throws java.io.IOException {
            this.copydefault.set(obj, this.OLrzqt, this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.Wq$Activity */
    public static final class Activity extends AbstractC5566Wq {
        public final java.lang.Object KWHzl;

        public Activity(AbstractC5566Wq abstractC5566Wq, java.lang.Object obj, java.lang.Object obj2) {
            super(abstractC5566Wq, obj);
            this.KWHzl = obj2;
        }

        @Override // o.AbstractC5566Wq
        public void copydefault(java.lang.Object obj) throws java.io.IOException {
            ((java.util.Map) obj).put(this.KWHzl, this.AEQbTJ);
        }
    }
}
