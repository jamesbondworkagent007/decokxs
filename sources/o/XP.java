package o;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class XP extends AbstractC5503Ug {
    public java.lang.String EZpvd;
    public final XP OLrzqt;
    public java.lang.Object copydefault;

    public abstract com.fasterxml.jackson.core.JsonToken AkhnZx();

    public abstract XP AuCTel();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public java.lang.Object KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public void copydefault(java.lang.Object obj) {
        this.copydefault = obj;
    }

    public abstract XP fARcdN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/Ug; */
    @Override // o.AbstractC5503Ug
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public final XP AEQbTJ() {
        return this.OLrzqt;
    }

    public abstract JsonNode values();

    public XP(int i, XP xp) {
        this.AEQbTJ = i;
        this.KWHzl = -1;
        this.OLrzqt = xp;
    }

    public static final class ActionBar extends XP {
        public boolean gEmmrt;
        public JsonNode valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.XP
        public JsonNode values() {
            if (this.gEmmrt) {
                return this.valueOf;
            }
            return null;
        }

        @Override // o.XP, o.AbstractC5503Ug
        public /* synthetic */ AbstractC5503Ug AEQbTJ() {
            return super.AEQbTJ();
        }

        public ActionBar(JsonNode jsonNode, XP xp) {
            super(0, xp);
            this.gEmmrt = false;
            this.valueOf = jsonNode;
        }

        @Override // o.XP
        public com.fasterxml.jackson.core.JsonToken AkhnZx() {
            if (this.gEmmrt) {
                this.valueOf = null;
                return null;
            }
            this.KWHzl++;
            this.gEmmrt = true;
            return this.valueOf.asToken();
        }

        @Override // o.XP
        public XP AuCTel() {
            return new Application(this.valueOf, this);
        }

        @Override // o.XP
        public XP fARcdN() {
            return new TaskDescription(this.valueOf, this);
        }
    }

    public static final class Application extends XP {
        public JsonNode gEmmrt;
        public java.util.Iterator<JsonNode> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.XP
        public JsonNode values() {
            return this.gEmmrt;
        }

        @Override // o.XP, o.AbstractC5503Ug
        public /* synthetic */ AbstractC5503Ug AEQbTJ() {
            return super.AEQbTJ();
        }

        public Application(JsonNode jsonNode, XP xp) {
            super(1, xp);
            this.valueOf = jsonNode.elements();
        }

        @Override // o.XP
        public com.fasterxml.jackson.core.JsonToken AkhnZx() {
            if (!this.valueOf.hasNext()) {
                this.gEmmrt = null;
                return com.fasterxml.jackson.core.JsonToken.END_ARRAY;
            }
            this.KWHzl++;
            JsonNode next = this.valueOf.next();
            this.gEmmrt = next;
            return next.asToken();
        }

        @Override // o.XP
        public XP AuCTel() {
            return new Application(this.gEmmrt, this);
        }

        @Override // o.XP
        public XP fARcdN() {
            return new TaskDescription(this.gEmmrt, this);
        }
    }

    public static final class TaskDescription extends XP {
        public boolean AYXKKw;
        public Map.Entry<java.lang.String, JsonNode> AhwBna;
        public java.util.Iterator<Map.Entry<java.lang.String, JsonNode>> gEmmrt;

        @Override // o.XP, o.AbstractC5503Ug
        public /* synthetic */ AbstractC5503Ug AEQbTJ() {
            return super.AEQbTJ();
        }

        public TaskDescription(JsonNode jsonNode, XP xp) {
            super(2, xp);
            this.gEmmrt = jsonNode.fields();
            this.AYXKKw = true;
        }

        @Override // o.XP
        public com.fasterxml.jackson.core.JsonToken AkhnZx() {
            if (this.AYXKKw) {
                if (!this.gEmmrt.hasNext()) {
                    this.EZpvd = null;
                    this.AhwBna = null;
                    return com.fasterxml.jackson.core.JsonToken.END_OBJECT;
                }
                this.KWHzl++;
                this.AYXKKw = false;
                Map.Entry<java.lang.String, JsonNode> next = this.gEmmrt.next();
                this.AhwBna = next;
                this.EZpvd = next != null ? next.getKey() : null;
                return com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
            }
            this.AYXKKw = true;
            return this.AhwBna.getValue().asToken();
        }

        @Override // o.XP
        public JsonNode values() {
            Map.Entry<java.lang.String, JsonNode> entry = this.AhwBna;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        @Override // o.XP
        public XP AuCTel() {
            return new Application(values(), this);
        }

        @Override // o.XP
        public XP fARcdN() {
            return new TaskDescription(values(), this);
        }
    }
}
