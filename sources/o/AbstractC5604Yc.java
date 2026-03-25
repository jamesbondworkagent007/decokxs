package o;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: renamed from: o.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5604Yc {
    public final boolean copydefault;

    public abstract VD<java.lang.Object> AEQbTJ(java.lang.Class<?> cls);

    public abstract AbstractC5604Yc AEQbTJ(java.lang.Class<?> cls, VD<java.lang.Object> vd);

    public AbstractC5604Yc(boolean z) {
        this.copydefault = z;
    }

    public AbstractC5604Yc(AbstractC5604Yc abstractC5604Yc) {
        this.copydefault = abstractC5604Yc.copydefault;
    }

    public final TaskDescription EZpvd(java.lang.Class<?> cls, VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdFindPrimaryPropertySerializer = vi.findPrimaryPropertySerializer(cls, beanProperty);
        return new TaskDescription(vdFindPrimaryPropertySerializer, AEQbTJ(cls, vdFindPrimaryPropertySerializer));
    }

    public final TaskDescription AEQbTJ(JavaType javaType, VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdFindPrimaryPropertySerializer = vi.findPrimaryPropertySerializer(javaType, beanProperty);
        return new TaskDescription(vdFindPrimaryPropertySerializer, AEQbTJ(javaType.getRawClass(), vdFindPrimaryPropertySerializer));
    }

    public final TaskDescription OLrzqt(java.lang.Class<?> cls, VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdFindContentValueSerializer = vi.findContentValueSerializer(cls, beanProperty);
        return new TaskDescription(vdFindContentValueSerializer, AEQbTJ(cls, vdFindContentValueSerializer));
    }

    public final TaskDescription OLrzqt(JavaType javaType, VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdFindContentValueSerializer = vi.findContentValueSerializer(javaType, beanProperty);
        return new TaskDescription(vdFindContentValueSerializer, AEQbTJ(javaType.getRawClass(), vdFindContentValueSerializer));
    }

    public final TaskDescription copydefault(java.lang.Class<?> cls, VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdFindKeySerializer = vi.findKeySerializer(cls, beanProperty);
        return new TaskDescription(vdFindKeySerializer, AEQbTJ(cls, vdFindKeySerializer));
    }

    public final TaskDescription OLrzqt(java.lang.Class<?> cls, VD<java.lang.Object> vd) {
        return new TaskDescription(vd, AEQbTJ(cls, vd));
    }

    public final TaskDescription EZpvd(JavaType javaType, VD<java.lang.Object> vd) {
        return new TaskDescription(vd, AEQbTJ(javaType.getRawClass(), vd));
    }

    public static AbstractC5604Yc copydefault() {
        return Application.EZpvd;
    }

    public static AbstractC5604Yc AEQbTJ() {
        return Application.KWHzl;
    }

    /* JADX INFO: renamed from: o.Yc$TaskDescription */
    public static final class TaskDescription {
        public final AbstractC5604Yc EZpvd;
        public final VD<java.lang.Object> KWHzl;

        public TaskDescription(VD<java.lang.Object> vd, AbstractC5604Yc abstractC5604Yc) {
            this.KWHzl = vd;
            this.EZpvd = abstractC5604Yc;
        }
    }

    /* JADX INFO: renamed from: o.Yc$Dialog */
    public static final class Dialog {
        public final VD<java.lang.Object> KWHzl;
        public final java.lang.Class<?> OLrzqt;

        public Dialog(java.lang.Class<?> cls, VD<java.lang.Object> vd) {
            this.OLrzqt = cls;
            this.KWHzl = vd;
        }
    }

    /* JADX INFO: renamed from: o.Yc$Application */
    public static final class Application extends AbstractC5604Yc {
        public static final Application EZpvd = new Application(false);
        public static final Application KWHzl = new Application(true);

        @Override // o.AbstractC5604Yc
        public VD<java.lang.Object> AEQbTJ(java.lang.Class<?> cls) {
            return null;
        }

        public Application(boolean z) {
            super(z);
        }

        @Override // o.AbstractC5604Yc
        public AbstractC5604Yc AEQbTJ(java.lang.Class<?> cls, VD<java.lang.Object> vd) {
            return new ActionBar(this, cls, vd);
        }
    }

    /* JADX INFO: renamed from: o.Yc$ActionBar */
    public static final class ActionBar extends AbstractC5604Yc {
        public final java.lang.Class<?> AEQbTJ;
        public final VD<java.lang.Object> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5604Yc
        public VD<java.lang.Object> AEQbTJ(java.lang.Class<?> cls) {
            if (cls == this.AEQbTJ) {
                return this.OLrzqt;
            }
            return null;
        }

        public ActionBar(AbstractC5604Yc abstractC5604Yc, java.lang.Class<?> cls, VD<java.lang.Object> vd) {
            super(abstractC5604Yc);
            this.AEQbTJ = cls;
            this.OLrzqt = vd;
        }

        @Override // o.AbstractC5604Yc
        public AbstractC5604Yc AEQbTJ(java.lang.Class<?> cls, VD<java.lang.Object> vd) {
            return new StateListAnimator(this, this.AEQbTJ, this.OLrzqt, cls, vd);
        }
    }

    /* JADX INFO: renamed from: o.Yc$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5604Yc {
        public final java.lang.Class<?> AEQbTJ;
        public final VD<java.lang.Object> EZpvd;
        public final VD<java.lang.Object> KWHzl;
        public final java.lang.Class<?> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5604Yc
        public VD<java.lang.Object> AEQbTJ(java.lang.Class<?> cls) {
            if (cls == this.AEQbTJ) {
                return this.EZpvd;
            }
            if (cls == this.OLrzqt) {
                return this.KWHzl;
            }
            return null;
        }

        public StateListAnimator(AbstractC5604Yc abstractC5604Yc, java.lang.Class<?> cls, VD<java.lang.Object> vd, java.lang.Class<?> cls2, VD<java.lang.Object> vd2) {
            super(abstractC5604Yc);
            this.AEQbTJ = cls;
            this.EZpvd = vd;
            this.OLrzqt = cls2;
            this.KWHzl = vd2;
        }

        @Override // o.AbstractC5604Yc
        public AbstractC5604Yc AEQbTJ(java.lang.Class<?> cls, VD<java.lang.Object> vd) {
            return new Activity(this, new Dialog[]{new Dialog(this.AEQbTJ, this.EZpvd), new Dialog(this.OLrzqt, this.KWHzl), new Dialog(cls, vd)});
        }
    }

    /* JADX INFO: renamed from: o.Yc$Activity */
    public static final class Activity extends AbstractC5604Yc {
        public final Dialog[] AEQbTJ;

        public Activity(AbstractC5604Yc abstractC5604Yc, Dialog[] dialogArr) {
            super(abstractC5604Yc);
            this.AEQbTJ = dialogArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
        @Override // o.AbstractC5604Yc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VD<java.lang.Object> AEQbTJ(java.lang.Class<?> cls) {
            Dialog dialog;
            Dialog dialog2;
            Dialog dialog3;
            Dialog dialog4;
            Dialog[] dialogArr = this.AEQbTJ;
            Dialog dialog5 = dialogArr[0];
            if (dialog5.OLrzqt == cls) {
                return dialog5.KWHzl;
            }
            Dialog dialog6 = dialogArr[1];
            if (dialog6.OLrzqt == cls) {
                return dialog6.KWHzl;
            }
            Dialog dialog7 = dialogArr[2];
            if (dialog7.OLrzqt == cls) {
                return dialog7.KWHzl;
            }
            switch (dialogArr.length) {
                case 4:
                    dialog = dialogArr[3];
                    if (dialog.OLrzqt == cls) {
                        return dialog.KWHzl;
                    }
                    return null;
                case 5:
                    dialog2 = dialogArr[4];
                    if (dialog2.OLrzqt == cls) {
                        return dialog2.KWHzl;
                    }
                    dialog = dialogArr[3];
                    if (dialog.OLrzqt == cls) {
                    }
                    break;
                case 6:
                    dialog3 = dialogArr[5];
                    if (dialog3.OLrzqt == cls) {
                        return dialog3.KWHzl;
                    }
                    dialog2 = dialogArr[4];
                    if (dialog2.OLrzqt == cls) {
                    }
                    dialog = dialogArr[3];
                    if (dialog.OLrzqt == cls) {
                    }
                    break;
                case 7:
                    dialog4 = dialogArr[6];
                    if (dialog4.OLrzqt == cls) {
                        return dialog4.KWHzl;
                    }
                    dialog3 = dialogArr[5];
                    if (dialog3.OLrzqt == cls) {
                    }
                    dialog2 = dialogArr[4];
                    if (dialog2.OLrzqt == cls) {
                    }
                    dialog = dialogArr[3];
                    if (dialog.OLrzqt == cls) {
                    }
                    break;
                case 8:
                    Dialog dialog8 = dialogArr[7];
                    if (dialog8.OLrzqt == cls) {
                        return dialog8.KWHzl;
                    }
                    dialog4 = dialogArr[6];
                    if (dialog4.OLrzqt == cls) {
                    }
                    dialog3 = dialogArr[5];
                    if (dialog3.OLrzqt == cls) {
                    }
                    dialog2 = dialogArr[4];
                    if (dialog2.OLrzqt == cls) {
                    }
                    dialog = dialogArr[3];
                    if (dialog.OLrzqt == cls) {
                    }
                    break;
                default:
                    return null;
            }
        }

        @Override // o.AbstractC5604Yc
        public AbstractC5604Yc AEQbTJ(java.lang.Class<?> cls, VD<java.lang.Object> vd) {
            Dialog[] dialogArr = this.AEQbTJ;
            int length = dialogArr.length;
            if (length == 8) {
                return this.copydefault ? new ActionBar(this, cls, vd) : this;
            }
            Dialog[] dialogArr2 = (Dialog[]) java.util.Arrays.copyOf(dialogArr, length + 1);
            dialogArr2[length] = new Dialog(cls, vd);
            return new Activity(this, dialogArr2);
        }
    }
}
