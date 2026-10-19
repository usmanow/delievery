require: import.sc

theme: /

    state: Start
        q!: $regex</start>
        script:
            var id = getRandomInt(1, clients.length)

            var client = _.find(clients, function(c) {
                return c.id === id
            })

            var order = _.find(orders, function(o) {
                return o.clientId === id
            })