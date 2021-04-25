
class Trip {

    String id;
    User user;
    Car car;
    Route route;
    Double amount;
    Payment payment;
    Double progress;
    Boolean completed;

    public Trip(String id, User user, Car car, Route route, Double amount, Payment payment, double progress,
            boolean completed) {

        this.id = id;
        this.user = user;
        this.car = car;
        this.route = route;
        this.amount = amount;
        this.payment = payment;
        this.progress = progress;
        this.completed = completed;
    }

}
