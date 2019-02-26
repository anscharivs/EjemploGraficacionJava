package GeoFiguras;

import GeoBasica.Dibujable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class MultiDibujable extends ArrayList<Dibujable> implements Dibujable {
    public MultiDibujable() {
        super();
    }

    public MultiDibujable(Collection<? extends Dibujable> collection) {
        super(collection);
    }

    @Override
    public void dibujar(Graphics dw) {
        for(Dibujable d : this)
            d.dibujar(dw);
    }

    @Override
    public Dibujable trasladar(double dx, double dy) {
        MultiDibujable ans = new MultiDibujable();
        for(Dibujable d : this)
            ans.add(d.trasladar(dx, dy));
        return ans;
    }

    @Override
    public Dibujable rotar(double deg) {
        MultiDibujable ans = new MultiDibujable();
        for(Dibujable d : this)
            ans.add(d.rotar(deg));
        return ans;
    }

    @Override
    public Dibujable escalar(double fx, double fy) {
        MultiDibujable ans = new MultiDibujable();
        for(Dibujable d : this)
            ans.add(d.escalar(fx, fy));
        return ans;
    }

    @Override
    public Dibujable sizallar(double a, double b) {
        MultiDibujable ans = new MultiDibujable();
        for(Dibujable d : this)
            ans.add(d.sizallar(a, b));
        return ans;
    }

    @Override
    public double minX() {
        double ans = 1e9;
        for(Dibujable d : this)
            ans = Math.min(ans, d.minX());
        return ans;
    }

    @Override
    public double maxX() {
        double ans = -1e9;
        for(Dibujable d : this)
            ans = Math.max(ans, d.maxX());
        return ans;
    }

    @Override
    public double minY() {
        double ans = 1e9;
        for(Dibujable d : this)
            ans = Math.min(ans, d.minY());
        return ans;
    }

    @Override
    public double maxY() {
        double ans = -1e9;
        for(Dibujable d : this)
            ans = Math.min(ans, d.maxY());
        return ans;
    }
}
