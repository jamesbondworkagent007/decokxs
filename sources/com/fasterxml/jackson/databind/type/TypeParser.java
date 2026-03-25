package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import o.C5619Yr;

/* JADX INFO: loaded from: classes21.dex */
public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    protected final TypeFactory _factory;

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        return typeFactory == this._factory ? this : new TypeParser(typeFactory);
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        TaskDescription taskDescription = new TaskDescription(str.trim());
        JavaType type = parseType(taskDescription);
        if (taskDescription.hasMoreTokens()) {
            throw _problem(taskDescription, "Unexpected tokens after complete type");
        }
        return type;
    }

    public JavaType parseType(TaskDescription taskDescription) throws IllegalArgumentException {
        if (!taskDescription.hasMoreTokens()) {
            throw _problem(taskDescription, "Unexpected end-of-string");
        }
        Class<?> clsFindClass = findClass(taskDescription.nextToken(), taskDescription);
        if (taskDescription.hasMoreTokens()) {
            String strNextToken = taskDescription.nextToken();
            if ("<".equals(strNextToken)) {
                return this._factory._fromClass(null, clsFindClass, TypeBindings.create(clsFindClass, parseTypes(taskDescription)));
            }
            taskDescription.AEQbTJ(strNextToken);
        }
        return this._factory._fromClass(null, clsFindClass, TypeBindings.emptyBindings());
    }

    public List<JavaType> parseTypes(TaskDescription taskDescription) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (taskDescription.hasMoreTokens()) {
            arrayList.add(parseType(taskDescription));
            if (!taskDescription.hasMoreTokens()) {
                break;
            }
            String strNextToken = taskDescription.nextToken();
            if (">".equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                throw _problem(taskDescription, "Unexpected token '" + strNextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(taskDescription, "Unexpected end-of-string");
    }

    public Class<?> findClass(String str, TaskDescription taskDescription) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            C5619Yr.AhwBna(e);
            throw _problem(taskDescription, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    public IllegalArgumentException _problem(TaskDescription taskDescription, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", taskDescription.copydefault(), taskDescription.AEQbTJ(), str));
    }

    public static final class TaskDescription extends StringTokenizer {
        public final String AEQbTJ;
        public int EZpvd;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String copydefault() {
            return this.AEQbTJ;
        }

        public TaskDescription(String str) {
            super(str, "<,>", true);
            this.AEQbTJ = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this.OLrzqt != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.OLrzqt;
            if (str != null) {
                this.OLrzqt = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.EZpvd += strNextToken.length();
            return strNextToken.trim();
        }

        public String AEQbTJ() {
            return this.AEQbTJ.substring(this.EZpvd);
        }
    }
}
